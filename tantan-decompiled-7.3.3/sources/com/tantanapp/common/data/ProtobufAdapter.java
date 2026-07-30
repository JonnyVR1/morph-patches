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
import p153l.azk0;
import p153l.ghq0;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ProtobufAdapter<T> {
    public static final int TAG_TYPE_BITS = 3;
    public static final ProtobufAdapter<String> STRING_ADAPTER = new ProtobufAdapter<String>() { // from class: com.tantanapp.common.data.ProtobufAdapter.4
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public String parse(nc5 nc5Var) throws IOException {
            return nc5Var.m162496t();
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(String str, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17317S(str);
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(String str) {
            return CodedOutputByteBufferNano.m17294u(str);
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
            return CodedOutputByteBufferNano.m17294u(num.toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Integer parse(nc5 nc5Var) throws IOException {
            return Integer.valueOf(Integer.parseInt(nc5Var.m162496t()));
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Integer num, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17317S(num.toString());
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
            return CodedOutputByteBufferNano.m17294u(l2.toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Long parse(nc5 nc5Var) throws IOException {
            return Long.valueOf(Long.parseLong(nc5Var.m162496t()));
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Long l2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17317S(l2.toString());
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
            return CodedOutputByteBufferNano.m17294u(d.toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Double parse(nc5 nc5Var) throws IOException {
            return Double.valueOf(Double.parseDouble(nc5Var.m162496t()));
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Double d, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17317S(d.toString());
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int getSize(Double d) {
            return computeAndCacheSize(d);
        }
    };
    protected int wireFormat = -1;

    /* JADX INFO: renamed from: ma */
    private ProtobufAdapter<Map<String, T>> f56864ma = null;

    /* JADX INFO: renamed from: aa */
    private ProtobufAdapter<List<T>> f56863aa = null;

    public static <T> ProtobufAdapter<Map<String, T>> HASH_MAP_ADAPTER(final qcj<T, String> qcjVar, ProtobufAdapter<T> protobufAdapter) {
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
                                size += CodedOutputByteBufferNano.m17296w(1, t, ProtobufAdapter.this);
                            }
                        }
                        return size;
                    }
                    for (T t2 : collectionValues) {
                        if (t2 != null) {
                            removeCacheSize(t2);
                            size += ProtobufAdapter.this.getSize(t2) + CodedOutputByteBufferNano.m17290q(1);
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
                                size += CodedOutputByteBufferNano.m17296w(1, t, ProtobufAdapter.this);
                            }
                        }
                        return size;
                    }
                    for (T t2 : collectionValues) {
                        if (t2 != null) {
                            removeCacheSize(t2);
                            size += ProtobufAdapter.this.getSize(t2) + CodedOutputByteBufferNano.m17290q(1);
                        }
                    }
                }
                return size;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.ProtobufAdapter
            public Map<String, T> parse(nc5 nc5Var) throws IOException {
                if (nc5Var.m162497u() == 0) {
                    return new HashMap();
                }
                int iM130256a = ghq0.m130256a(nc5Var, this.itemTag);
                HashMap map = new HashMap(iM130256a);
                int i = 0;
                if (ProtobufAdapter.this.wireFormat == 2) {
                    while (true) {
                        int i2 = iM130256a - 1;
                        ProtobufAdapter<T> protobufAdapter2 = ProtobufAdapter.this;
                        if (i >= i2) {
                            Object objM162488l = nc5Var.m162488l(protobufAdapter2);
                            map.put((String) qcjVar.call(objM162488l), objM162488l);
                            return map;
                        }
                        Object objM162488l2 = nc5Var.m162488l(protobufAdapter2);
                        map.put((String) qcjVar.call(objM162488l2), objM162488l2);
                        nc5Var.m162497u();
                        i++;
                    }
                } else {
                    while (true) {
                        int i3 = iM130256a - 1;
                        ProtobufAdapter protobufAdapter3 = ProtobufAdapter.this;
                        if (i >= i3) {
                            Object obj = protobufAdapter3.parse(nc5Var);
                            map.put((String) qcjVar.call(obj), obj);
                            return map;
                        }
                        Object obj2 = protobufAdapter3.parse(nc5Var);
                        map.put((String) qcjVar.call(obj2), obj2);
                        nc5Var.m162497u();
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
                        codedOutputByteBufferNano.m17319U(1, ProtobufAdapter.this.wireFormat);
                        ProtobufAdapter protobufAdapter2 = ProtobufAdapter.this;
                        if (protobufAdapter2.wireFormat == 2) {
                            codedOutputByteBufferNano.m17314P(protobufAdapter2.getSize(t));
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
        if (this.f56863aa == null) {
            this.f56863aa = ARRAY_ADAPTER(this);
        }
        return this.f56863aa;
    }

    public ProtobufAdapter<Map<String, T>> MAP_ADAPTER() {
        if (this.f56864ma == null) {
            this.f56864ma = MAP_ADAPTER(this);
        }
        return this.f56864ma;
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

    public abstract T parse(nc5 nc5Var) throws IOException;

    public final T parse(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        try {
            return parse(nc5.m162477d(bArr, 0, bArr.length));
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            azk0.m101074a("Reading from a byte array threw an IOException (should never happen).");
            return null;
        }
    }

    public abstract void serialize(T t, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException;

    public byte[] serialize(T t) throws IOException {
        if (t == null) {
            return null;
        }
        byte[] bArr = new byte[computeAndCacheSize(t)];
        CodedOutputByteBufferNano codedOutputByteBufferNanoM17297x = CodedOutputByteBufferNano.m17297x(bArr);
        serialize(t, codedOutputByteBufferNanoM17297x);
        codedOutputByteBufferNanoM17297x.m17320a();
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
                    int iM17285l = 0;
                    while (i < list.size()) {
                        T t = list.get(i);
                        if (t != null) {
                            iM17285l += CodedOutputByteBufferNano.m17285l(1, t, ProtobufAdapter.this);
                        }
                        i++;
                    }
                    return iM17285l;
                }
                int iComputeAndCacheSize = 0;
                while (i < list.size()) {
                    T t2 = list.get(i);
                    if (t2 != null) {
                        iComputeAndCacheSize += ProtobufAdapter.this.computeAndCacheSize(t2) + CodedOutputByteBufferNano.m17290q(1);
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
                    int iM17296w = 0;
                    while (i < list.size()) {
                        T t = list.get(i);
                        if (t != null) {
                            iM17296w += CodedOutputByteBufferNano.m17296w(1, t, ProtobufAdapter.this);
                        }
                        i++;
                    }
                    return iM17296w;
                }
                int size = 0;
                while (i < list.size()) {
                    T t2 = list.get(i);
                    if (t2 != null) {
                        size += ProtobufAdapter.this.getSize(t2) + CodedOutputByteBufferNano.m17290q(1);
                    }
                    i++;
                }
                return size;
            }

            @Override // com.tantanapp.common.data.ProtobufAdapter
            public List<T> parse(nc5 nc5Var) throws IOException {
                if (nc5Var.m162497u() == 0) {
                    return new ArrayList();
                }
                int iM130256a = ghq0.m130256a(nc5Var, this.itemTag);
                ArrayList arrayList = new ArrayList(iM130256a);
                int i = 0;
                if (ProtobufAdapter.this.wireFormat == 2) {
                    while (true) {
                        int i2 = iM130256a - 1;
                        ProtobufAdapter<T> protobufAdapter2 = ProtobufAdapter.this;
                        if (i >= i2) {
                            arrayList.add(nc5Var.m162488l(protobufAdapter2));
                            return arrayList;
                        }
                        arrayList.add(nc5Var.m162488l(protobufAdapter2));
                        nc5Var.m162497u();
                        i++;
                    }
                } else {
                    while (true) {
                        int i3 = iM130256a - 1;
                        ProtobufAdapter protobufAdapter3 = ProtobufAdapter.this;
                        if (i >= i3) {
                            arrayList.add(protobufAdapter3.parse(nc5Var));
                            return arrayList;
                        }
                        arrayList.add(protobufAdapter3.parse(nc5Var));
                        nc5Var.m162497u();
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
                            codedOutputByteBufferNano.m17319U(1, ProtobufAdapter.this.wireFormat);
                            ProtobufAdapter protobufAdapter2 = ProtobufAdapter.this;
                            if (protobufAdapter2.wireFormat == 2) {
                                codedOutputByteBufferNano.m17314P(protobufAdapter2.getSize(t));
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
            public Map<String, T> parse(nc5 nc5Var) throws IOException {
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
