package io.github.sapporo1101.oritechadjust.resource;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;

@FunctionalInterface
public interface PathResourceModifier {
    byte @Nullable [] modify(String path, byte[] data) throws IOException;
}
