package me.travis.wurstplusthree.util.elements;

import me.travis.wurstplusthree.util.Globals;
import me.travis.wurstplusthree.util.PlayerUtil;

import java.util.UUID;

public class WurstplusPlayer implements Globals {

    private final String name;
    private final UUID uuid;
    private String nickName;

    public WurstplusPlayer(String name) {
        this.name = name;
        this.uuid = PlayerUtil.getUUIDFromName(name);
    }

    public WurstplusPlayer(String name, UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String name) {
        this.nickName = name;
    }

}
