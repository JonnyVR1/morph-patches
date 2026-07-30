package com.tantanapp.common.data;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.b8q0;
import p149l.nb5;
import p149l.upk0;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ProtobufAdapter<T> {
    public static final int TAG_TYPE_BITS = 3;
    public static final ProtobufAdapter<String> STRING_ADAPTER = new ProtobufAdapter<String>() { // from class: com.tantanapp.common.data.ProtobufAdapter.4
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public String parse(nb5 nb5Var) throws IOException {
            return nb5Var.m158751t();
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(String str, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17262S(str);
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(String str) {
            return CodedOutputByteBufferNano.m17239u(str);
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int getSize(String str) {
            return computeAndCacheSize(str);
        }
    };
    public static final ProtobufAdapter<Integer> INT_BOXED_ADAPTER = new ProtobufAdapter<Integer>() { // from class: com.tantanapp.common.data.ProtobufAdapter.5
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Integer num) {
            return CodedOutputByteBufferNano.m17239u(num.toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Integer parse(nb5 nb5Var) throws IOException {
            return Integer.valueOf(Integer.parseInt(nb5Var.m158751t()));
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Integer num, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17262S(num.toString());
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int getSize(Integer num) {
            return computeAndCacheSize(num);
        }
    };
    public static final ProtobufAdapter<Long> LONG_BOXED_ADAPTER = new ProtobufAdapter<Long>() { // from class: com.tantanapp.common.data.ProtobufAdapter.6
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Long l2) {
            return CodedOutputByteBufferNano.m17239u(l2.toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Long parse(nb5 nb5Var) throws IOException {
            return Long.valueOf(Long.parseLong(nb5Var.m158751t()));
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Long l2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17262S(l2.toString());
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int getSize(Long l2) {
            return computeAndCacheSize(l2);
        }
    };
    public static final ProtobufAdapter<Double> DOUBLE_BOXED_ADAPTER = new ProtobufAdapter<Double>() { // from class: com.tantanapp.common.data.ProtobufAdapter.7
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Double d) {
            return CodedOutputByteBufferNano.m17239u(d.toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Double parse(nb5 nb5Var) throws IOException {
            return Double.valueOf(Double.parseDouble(nb5Var.m158751t()));
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Double d, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17262S(d.toString());
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int getSize(Double d) {
            return computeAndCacheSize(d);
        }
    };
    protected int wireFormat = -1;

    /* JADX INFO: renamed from: ma */
    private ProtobufAdapter<Map<String, T>> f56016ma = null;

    /* JADX INFO: renamed from: aa */
    private ProtobufAdapter<List<T>> f56015aa = null;

    public static <T> ProtobufAdapter<Map<String, T>> HASH_MAP_ADAPTER(final w9j<T, String> w9jVar, ProtobufAdapter<T> protobufAdapter) {
        return new ProtobufAdapter<Map<String, T>>() { // from class: com.tantanapp.common.data.ProtobufAdapter.2
            int itemTag;

            {
                this.wireFormat = 2;
                this.itemTag = ProtobufAdapter.makeTag(1, ProtobufAdapter.this.wireFormat);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private <T> void removeCacheSize(T t) {
                if (t instanceof ValueObject) {
                    ((ValueObject) t).cachedSize = -1;
                }
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public int computeAndCacheSize(Map<String, T> map) {
                int size = 0;
                if (map != null && !map.isEmpty()) {
                    Collection<T> collectionValues = map.values();
                    if (ProtobufAdapter.this.wireFormat == 2) {
                        for (T t : collectionValues) {
                            if (t != null) {
                                removeCacheSize(t);
                                size += CodedOutputByteBufferNano.m17241w(1, t, ProtobufAdapter.this);
                            }
                        }
                        return size;
                    }
                    for (T t2 : collectionValues) {
                        if (t2 != null) {
                            removeCacheSize(t2);
                            size += ProtobufAdapter.this.getSize(t2) + CodedOutputByteBufferNano.m17235q(1);
                        }
                    }
                }
                return size;
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public int getSize(Map<String, T> map) {
                int size = 0;
                if (map != null && !map.isEmpty()) {
                    Collection<T> collectionValues = map.values();
                    if (ProtobufAdapter.this.wireFormat == 2) {
                        for (T t : collectionValues) {
                            if (t != null) {
                                removeCacheSize(t);
                                size += CodedOutputByteBufferNano.m17241w(1, t, ProtobufAdapter.this);
                            }
                        }
                        return size;
                    }
                    for (T t2 : collectionValues) {
                        if (t2 != null) {
                            removeCacheSize(t2);
                            size += ProtobufAdapter.this.getSize(t2) + CodedOutputByteBufferNano.m17235q(1);
                        }
                    }
                }
                return size;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.ProtobufAdapter
            public Map<String, T> parse(nb5 nb5Var) throws IOException {
                if (nb5Var.m158752u() == 0) {
                    return new HashMap();
                }
                int iM100784a = b8q0.m100784a(nb5Var, this.itemTag);
                HashMap map = new HashMap(iM100784a);
                int i = 0;
                if (ProtobufAdapter.this.wireFormat == 2) {
                    while (true) {
                        int i2 = iM100784a - 1;
                        ProtobufAdapter<T> protobufAdapter2 = ProtobufAdapter.this;
                        if (i >= i2) {
                            Object objM158743l = nb5Var.m158743l(protobufAdapter2);
                            map.put((String) w9jVar.call(objM158743l), objM158743l);
                            return map;
                        }
                        Object objM158743l2 = nb5Var.m158743l(protobufAdapter2);
                        map.put((String) w9jVar.call(objM158743l2), objM158743l2);
                        nb5Var.m158752u();
                        i++;
                    }
                } else {
                    while (true) {
                        int i3 = iM100784a - 1;
                        ProtobufAdapter protobufAdapter3 = ProtobufAdapter.this;
                        if (i >= i3) {
                            Object obj = protobufAdapter3.parse(nb5Var);
                            map.put((String) w9jVar.call(obj), obj);
                            return map;
                        }
                        Object obj2 = protobufAdapter3.parse(nb5Var);
                        map.put((String) w9jVar.call(obj2), obj2);
                        nb5Var.m158752u();
                        i++;
                    }
                }
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public void serialize(Map<String, T> map, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (map == null || map.isEmpty()) {
                    return;
                }
                for (T t : map.values()) {
                    if (t != null) {
                        codedOutputByteBufferNano.m17264U(1, ProtobufAdapter.this.wireFormat);
                        ProtobufAdapter protobufAdapter2 = ProtobufAdapter.this;
                        if (protobufAdapter2.wireFormat == 2) {
                            codedOutputByteBufferNano.m17259P(protobufAdapter2.getSize(t));
                        }
                        ProtobufAdapter.this.serialize(t, codedOutputByteBufferNano);
                    }
                }
            }
        };
    }

    public static int makeTag(int i, int i2) {
        return (i << 3) | i2;
    }

    public ProtobufAdapter<List<T>> ARRAY_ADAPTER() {
        if (this.f56015aa == null) {
            this.f56015aa = ARRAY_ADAPTER(this);
        }
        return this.f56015aa;
    }

    public ProtobufAdapter<Map<String, T>> MAP_ADAPTER() {
        if (this.f56016ma == null) {
            this.f56016ma = MAP_ADAPTER(this);
        }
        return this.f56016ma;
    }

    public abstract int computeAndCacheSize(T t);

    public final T get(byte[] bArr) {
        try {
            return parse(bArr);
        } catch (IOException unused) {
            return null;
        }
    }

    public abstract int getSize(T t);

    public abstract T parse(nb5 nb5Var) throws IOException;

    public final T parse(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        try {
            return parse(nb5.m158732d(bArr, 0, bArr.length));
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            upk0.m194883a("Reading from a byte array threw an IOException (should never happen).");
            return null;
        }
    }

    public abstract void serialize(T t, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException;

    public byte[] serialize(T t) throws IOException {
        if (t == null) {
            return null;
        }
        byte[] bArr = new byte[computeAndCacheSize(t)];
        CodedOutputByteBufferNano codedOutputByteBufferNanoM17242x = CodedOutputByteBufferNano.m17242x(bArr);
        serialize(t, codedOutputByteBufferNanoM17242x);
        codedOutputByteBufferNanoM17242x.m17265a();
        return bArr;
    }

    public byte[] toBytes(T t) {
        try {
            return serialize(t);
        } catch (IOException unused) {
            return null;
        }
    }

    public static <T> ProtobufAdapter<List<T>> ARRAY_ADAPTER(ProtobufAdapter<T> protobufAdapter) {
        return new ProtobufAdapter<List<T>>() { // from class: com.tantanapp.common.data.ProtobufAdapter.3
            int itemTag;

            {
                this.wireFormat = 2;
                this.itemTag = ProtobufAdapter.makeTag(1, ProtobufAdapter.this.wireFormat);
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public int computeAndCacheSize(List<T> list) {
                int i = 0;
                if (list == null) {
                    return 0;
                }
                if (ProtobufAdapter.this.wireFormat == 2) {
                    int iM17230l = 0;
                    while (i < list.size()) {
                        T t = list.get(i);
                        if (t != null) {
                            iM17230l += CodedOutputByteBufferNano.m17230l(1, t, ProtobufAdapter.this);
                        }
                        i++;
                    }
                    return iM17230l;
                }
                int iComputeAndCacheSize = 0;
                while (i < list.size()) {
                    T t2 = list.get(i);
                    if (t2 != null) {
                        iComputeAndCacheSize += ProtobufAdapter.this.computeAndCacheSize(t2) + CodedOutputByteBufferNano.m17235q(1);
                    }
                    i++;
                }
                return iComputeAndCacheSize;
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public int getSize(List<T> list) {
                int i = 0;
                if (list == null) {
                    return 0;
                }
                if (ProtobufAdapter.this.wireFormat == 2) {
                    int iM17241w = 0;
                    while (i < list.size()) {
                        T t = list.get(i);
                        if (t != null) {
                            iM17241w += CodedOutputByteBufferNano.m17241w(1, t, ProtobufAdapter.this);
                        }
                        i++;
                    }
                    return iM17241w;
                }
                int size = 0;
                while (i < list.size()) {
                    T t2 = list.get(i);
                    if (t2 != null) {
                        size += ProtobufAdapter.this.getSize(t2) + CodedOutputByteBufferNano.m17235q(1);
                    }
                    i++;
                }
                return size;
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public List<T> parse(nb5 nb5Var) throws IOException {
                if (nb5Var.m158752u() == 0) {
                    return new ArrayList();
                }
                int iM100784a = b8q0.m100784a(nb5Var, this.itemTag);
                ArrayList arrayList = new ArrayList(iM100784a);
                int i = 0;
                if (ProtobufAdapter.this.wireFormat == 2) {
                    while (true) {
                        int i2 = iM100784a - 1;
                        ProtobufAdapter<T> protobufAdapter2 = ProtobufAdapter.this;
                        if (i >= i2) {
                            arrayList.add(nb5Var.m158743l(protobufAdapter2));
                            return arrayList;
                        }
                        arrayList.add(nb5Var.m158743l(protobufAdapter2));
                        nb5Var.m158752u();
                        i++;
                    }
                } else {
                    while (true) {
                        int i3 = iM100784a - 1;
                        ProtobufAdapter protobufAdapter3 = ProtobufAdapter.this;
                        if (i >= i3) {
                            arrayList.add(protobufAdapter3.parse(nb5Var));
                            return arrayList;
                        }
                        arrayList.add(protobufAdapter3.parse(nb5Var));
                        nb5Var.m158752u();
                        i++;
                    }
                }
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public void serialize(List<T> list, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        T t = list.get(i);
                        if (t != null) {
                            codedOutputByteBufferNano.m17264U(1, ProtobufAdapter.this.wireFormat);
                            ProtobufAdapter protobufAdapter2 = ProtobufAdapter.this;
                            if (protobufAdapter2.wireFormat == 2) {
                                codedOutputByteBufferNano.m17259P(protobufAdapter2.getSize(t));
                            }
                            ProtobufAdapter.this.serialize(t, codedOutputByteBufferNano);
                        }
                    }
                }
            }
        };
    }

    public static <T> ProtobufAdapter<Map<String, T>> MAP_ADAPTER(ProtobufAdapter<T> protobufAdapter) {
        return new ProtobufAdapter<Map<String, T>>() { // from class: com.tantanapp.common.data.ProtobufAdapter.1
            {
                this.wireFormat = 2;
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public Map<String, T> parse(nb5 nb5Var) throws IOException {
                return Collections.EMPTY_MAP;
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public void serialize(Map<String, T> map, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public int computeAndCacheSize(Map<String, T> map) {
                return 0;
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public int getSize(Map<String, T> map) {
                return 0;
            }
        };
    }
}
