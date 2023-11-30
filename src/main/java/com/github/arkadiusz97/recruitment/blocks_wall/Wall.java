package com.github.arkadiusz97.recruitment.blocks_wall;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock {
    private List<Block> blocks;

    public List<Block> getBlocks() {
        return blocks;
    }

    public int count() {
        return blocks.size();
    }

    public Optional<Block> findBlockByColor(String color) {
        Optional<Block> result = Optional.empty();
        for(Block block : blocks) {
            if(block.getColor().equals(color)) {
                result = Optional.of(block);
                break;
            }
        }
        return result;
    }
    public List<Block> findBlocksByMaterial(String material) {
        ArrayList<Block> results = new ArrayList<Block>();
        for(Block block : blocks) {
            if(block.getMaterial().equals(material)) {
                results.add(block);
            }
        }
        return results;
    }

}
