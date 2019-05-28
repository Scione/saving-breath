package games.phenomena;

import java.util.ArrayList;

public class Entity
{
    private Point position, perspective;
    private boolean alive;
    private float durability, damage, strength, mass, capacity, volume, oxygen, hydration, saturation;
    private ArrayList<Entity> heldEntities;

    public Entity(Point position, Point perspective, boolean alive, float durability, float damage, float strength,
                  float mass, float capacity, float volume, float oxygen, float hydration, float saturation)
    {
        this.position = position;
        this.perspective = perspective;

        this.alive = alive;
        this.durability = durability;
        this.damage = damage;
        this.strength = strength;
        this.mass = mass;
        this.capacity = capacity;
        this.volume = volume;
        this.oxygen = oxygen;
        this.hydration = hydration;
        this.saturation = saturation;

        heldEntities = new ArrayList<>();
    }

    public void update()
    {
        if(alive)
        {
            if(durability - damage <= 0) alive = false;
        }
    }

    public Point getPosition()
    {
        return position;
    }

    public void setPosition(Point position)
    {
        this.position = position;
    }

    public Point getPerspective()
    {
        return perspective;
    }

    public void setPerspective(Point perspective)
    {
        this.perspective = perspective;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }

    public float getDurability()
    {
        return durability;
    }

    public void setDurability(float durability)
    {
        this.durability = durability;
    }

    public float getDamage()
    {
        return damage;
    }

    public void setDamage(float damage)
    {
        this.damage = damage;
    }

    public float getStrength()
    {
        return strength;
    }

    public void setStrength(float strength)
    {
        this.strength = strength;
    }

    public float getMass()
    {
        return mass;
    }

    public void setMass(float mass)
    {
        this.mass = mass;
    }

    public float getCapacity()
    {
        return capacity;
    }

    public void setCapacity(float capacity)
    {
        this.capacity = capacity;
    }

    public float getVolume()
    {
        return volume;
    }

    public void setVolume(float volume)
    {
        this.volume = volume;
    }

    public float getOxygen()
    {
        return oxygen;
    }

    public void setOxygen(float oxygen)
    {
        this.oxygen = oxygen;
    }

    public float getHydration()
    {
        return hydration;
    }

    public void setHydration(float hydration)
    {
        this.hydration = hydration;
    }

    public float getSaturation()
    {
        return saturation;
    }

    public void setSaturation(float saturation)
    {
        this.saturation = saturation;
    }

    public ArrayList<Entity> getHeldEntities()
    {
        return heldEntities;
    }

    public void setHeldEntities(ArrayList<Entity> heldEntities)
    {
        this.heldEntities = heldEntities;
    }
}