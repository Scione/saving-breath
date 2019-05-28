package games.phenomena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EntityTest
{
    @Test
    public void testEntityInitialization()
    {
        Point position = new Point(1f, 1f);
        Point perspective = new Point(1f, 1f);
        boolean alive = true;
        float durability = 1f;
        float damage = 0.5f;
        float strength = 0.5f;
        float mass = 1f;
        float capacity = 0.5f;
        float volume = 1f;
        float oxygen = 0.9f;
        float hydration = 0.9f;
        float saturation = 0.9f;

        Entity creature;

        creature = new Entity(position, perspective, alive, durability, damage, strength, mass, capacity, volume, oxygen, hydration, saturation);

        Assertions.assertEquals(true, creature instanceof Entity);
    }

    @Test
    public void testEntityUpdate()
    {
        Point position = new Point(1f, 1f);
        Point perspective = new Point(1f, 1f);
        boolean alive = true;
        float durability = 1f;
        float damage = 0.5f;
        float strength = 0.5f;
        float mass = 1f;
        float capacity = 0.5f;
        float volume = 1f;
        float oxygen = 0.9f;
        float hydration = 0.9f;
        float saturation = 0.9f;
        Entity creature = new Entity(position, perspective, alive, durability, damage, strength, mass, capacity, volume, oxygen, hydration, saturation);

        creature.update();
        Assertions.assertEquals(true, creature.isAlive());

        creature.setDamage(1f);
        creature.update();
        Assertions.assertEquals(false, creature.isAlive());
    }
}