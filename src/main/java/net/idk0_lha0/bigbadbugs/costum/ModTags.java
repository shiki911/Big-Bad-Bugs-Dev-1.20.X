package net.idk0_lha0.bigbadbugs.costum;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CALAMITES_LOGS = createTag("calamites_logs");
        public static final TagKey<Block> CORDAITES_LOGS = createTag("cordaites_logs");
        public static final TagKey<Block> LEPIDODENDRON_LOGS = createTag("lepidodendron_logs");
        public static final TagKey<Block> SIGILLARIA_LOGS = createTag("sigillaria_logs");
        public static final TagKey<Block> PSARONIUS_LOGS  = createTag("psaronius_logs");
        public static final TagKey<Block> MEDULLOSA_LOGS = createTag("medullosa_logs");

        private static TagKey<Block> createTag(String id) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(BigBadBugs.MOD_ID, id));
        }
    }

    public static class Items {
        public static final TagKey<Item> CALAMITES_LOGS = createTag("calamites_logs");
        public static final TagKey<Item> CORDAITES_LOGS = createTag("cordaites_logs");
        public static final TagKey<Item> LEPIDODENDRON_LOGS = createTag("lepidodendron_logs");
        public static final TagKey<Item> SIGILLARIA_LOGS = createTag("sigillaria_logs");
        public static final TagKey<Item> PSARONIUS_LOGS  = createTag("psaronius_logs");
        public static final TagKey<Item> MEDULLOSA_LOGS = createTag("medullosa_logs");

        private static TagKey<Item> createTag(String id) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(BigBadBugs.MOD_ID, id));
        }
    }
}
