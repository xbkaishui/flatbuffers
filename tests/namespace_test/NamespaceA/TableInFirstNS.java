// automatically generated, do not modify

package NamespaceA;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TableInFirstNS extends Table {
  public static TableInFirstNS getRootAsTableInFirstNS(ByteBuffer _bb) { return getRootAsTableInFirstNS(_bb, new TableInFirstNS()); }
  public static TableInFirstNS getRootAsTableInFirstNS(ByteBuffer _bb, TableInFirstNS obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public TableInFirstNS __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public NamespaceA.NamespaceB.TableInNestedNS fooTable() { return fooTable(new NamespaceA.NamespaceB.TableInNestedNS()); }
  public NamespaceA.NamespaceB.TableInNestedNS fooTable(NamespaceA.NamespaceB.TableInNestedNS obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public byte fooEnum() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateFooEnum(byte foo_enum) { int o = __offset(6); if (o != 0) { bb.put(o + bb_pos, foo_enum); return true; } else { return false; } }
  public NamespaceA.NamespaceB.StructInNestedNS fooStruct() { return fooStruct(new NamespaceA.NamespaceB.StructInNestedNS()); }
  public NamespaceA.NamespaceB.StructInNestedNS fooStruct(NamespaceA.NamespaceB.StructInNestedNS obj) { int o = __offset(8); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }

  public static void startTableInFirstNS(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addFooTable(FlatBufferBuilder builder, int fooTableOffset) { builder.addOffset(0, fooTableOffset, 0); }
  public static void addFooEnum(FlatBufferBuilder builder, byte fooEnum) { builder.addByte(1, fooEnum, 0); }
  public static void addFooStruct(FlatBufferBuilder builder, int fooStructOffset) { builder.addStruct(2, fooStructOffset, 0); }
  public static int endTableInFirstNS(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

