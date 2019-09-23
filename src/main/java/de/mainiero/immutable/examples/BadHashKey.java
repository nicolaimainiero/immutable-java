package de.mainiero.immutable.examples;

import java.util.HashMap;

import com.google.common.truth.Truth;

/**
 * Hello world!
 */
public final class BadHashKey {
    private BadHashKey() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person jim  = new Person("James Holden");
        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(jim, "ice freighter");
        Truth.assertThat(hashMap.get(jim)).contains("ice freighter");
        jim.setName("Julie Mao");
        Truth.assertThat(hashMap.get(jim)).contains("ice freighter"); // fails
    }

    final static class Person {
        private String name;
      
        public Person(String name) {
          this.name = name;
        }
      
        public String getName() {
          return name;
        }
      
        public void setName(String name) {
          this.name = name;
        }
      
        public int hashCode() {
          return name.hashCode();
        }
      
        public boolean equals(Object otherObj) {
          Person otherPerson = (Person) otherObj;
          return (name.equals(otherPerson.getName()));
        }
      }
}
