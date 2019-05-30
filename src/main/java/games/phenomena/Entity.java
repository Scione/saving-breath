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

    public void setPosition(Point newPosition)
    {
        position = newPosition;
    }

    public Point getPerspective()
    {
        return perspective;
    }

    public void setPerspective(Point newPerspective)
    {
        perspective = newPerspective;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public void setAlive(boolean isAlive)
    {
        alive = isAlive;
    }

    public float getDurability()
    {
        return durability;
    }

    public void setDurability(float newDurability)
    {
        durability = newDurability;
    }

    public void addToDurability(float additionalDurability)
    {
        durability += additionalDurability;
    }

    public void multiplyDurability(float durabilityMultiplier)
    {
        durability *= durabilityMultiplier;
    }

    public float getDamage()
    {
        return damage;
    }

    public void setDamage(float damage)
    {
        this.damage = damage;
    }

    public void addToDamage(float additionalDamage)
    {
        damage += additionalDamage;
    }

    public void multiplyDamage(float damageMultiplier)
    {
        damage *= damageMultiplier;
    }

    public float getStrength()
    {
        return strength;
    }

    public void setStrength(float newStrength)
    {
        strength = newStrength;
    }

    public void addToStrength(float additionalStrength)
    {
        strength += additionalStrength;
    }

    public void multiplyStrength(float strengthMultiplier)
    {
        strength *= strengthMultiplier;
    }

    public float getMass()
    {
        return mass;
    }

    public void setMass(float newMass)
    {
        mass = newMass;
    }

    public void addToMass(float additionalMass)
    {
        mass += additionalMass;
    }

    public void multiplyMass(float massMultiplier)
    {
        mass *= massMultiplier;
    }

    public float getCapacity()
    {
        return capacity;
    }

    public void setCapacity(float capacity)
    {
        this.capacity = capacity;
    }

    public void addToCapacity(float additionalCapacity)
    {
        capacity += additionalCapacity;
    }

    public void multiplyCapacity(float capacityMultiplier)
    {
        capacity *= capacityMultiplier;
    }

    public float getVolume()
    {
        return volume;
    }

    public void setVolume(float newVolume)
    {
        volume = newVolume;
    }

    public void addToVolume(float additionalVolume)
    {
        volume += additionalVolume;
    }

    public void multiplyVolume(float volumeMultiplier)
    {
        volume *= volumeMultiplier;
    }

    public float getOxygen()
    {
        return oxygen;
    }

    public void setOxygen(float newOxygen)
    {
        oxygen = newOxygen;
    }

    public void addToOxygen(float additionalOxygen)
    {
        oxygen += additionalOxygen;
    }

    public void multiplyOxygen(float oxygenMultiplier)
    {
        oxygen *= oxygenMultiplier;
    }

    public float getHydration()
    {
        return hydration;
    }

    public void setHydration(float newHydration)
    {
        hydration = newHydration;
    }

    public void addToHydration(float additionalHydration)
    {
        hydration += additionalHydration;
    }

    public void multiplyHydration(float hydrationMultiplier)
    {
        hydration *= hydrationMultiplier;
    }

    public float getSaturation()
    {
        return saturation;
    }

    public void setSaturation(float newSaturation)
    {
        saturation = newSaturation;
    }

    public void addToSaturation(float additionalSaturation)
    {
        saturation += additionalSaturation;
    }

    public void multiplySaturation(float saturationMultiplier)
    {
        saturation *= saturationMultiplier;
    }

    public ArrayList<Entity> getHeldEntities()
    {
        return heldEntities;
    }

    public void setHeldEntities(ArrayList<Entity> newHeldEntities)
    {
        heldEntities = newHeldEntities;
    }
}