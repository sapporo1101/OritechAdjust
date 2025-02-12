package io.github.sapporo1101.oritechadjust.resource;

import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface QuickResourceModifier {
    byte @Nullable [] modify(byte[] data);
}