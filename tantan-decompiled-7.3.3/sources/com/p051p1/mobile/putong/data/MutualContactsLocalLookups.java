package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Contact;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class MutualContactsLocalLookups extends ValueObject implements Cloneable, Serializable {
    public static ProtobufAdapter<MutualContactsLocalLookups> PROTOBUF_ADAPTER = new MessageNanoAdapter<MutualContactsLocalLookups>() { // from class: com.p1.mobile.putong.data.MutualContactsLocalLookups.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MutualContactsLocalLookups mutualContactsLocalLookups) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, mutualContactsLocalLookups.batchSize);
            List<Contact> list = mutualContactsLocalLookups.lookups;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = mutualContactsLocalLookups.next;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            mutualContactsLocalLookups.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MutualContactsLocalLookups parse(nc5 nc5Var) throws IOException {
            MutualContactsLocalLookups mutualContactsLocalLookups = new MutualContactsLocalLookups();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (mutualContactsLocalLookups.lookups != null) {
                        break;
                    }
                    mutualContactsLocalLookups.lookups = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    mutualContactsLocalLookups.batchSize = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    mutualContactsLocalLookups.lookups = (List) nc5Var.m162488l(Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (mutualContactsLocalLookups.lookups != null) {
                            break;
                        }
                        mutualContactsLocalLookups.lookups = new ArrayList();
                        return mutualContactsLocalLookups;
                    }
                    mutualContactsLocalLookups.next = nc5Var.m162495s();
                }
            }
            return mutualContactsLocalLookups;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MutualContactsLocalLookups mutualContactsLocalLookups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, mutualContactsLocalLookups.batchSize);
            List<Contact> list = mutualContactsLocalLookups.lookups;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = mutualContactsLocalLookups.next;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static final String TYPE = "mutualcontactslocallookups";

    @ProtobufIndex(index = 1)
    public int batchSize;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Contact> lookups;

    @Nullable
    @ProtobufIndex(index = 3)
    public String next;

    public static MutualContactsLocalLookups new_() {
        MutualContactsLocalLookups mutualContactsLocalLookups = new MutualContactsLocalLookups();
        mutualContactsLocalLookups.nullCheck();
        return mutualContactsLocalLookups;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MutualContactsLocalLookups mo225055clone() {
        MutualContactsLocalLookups mutualContactsLocalLookups = new MutualContactsLocalLookups();
        mutualContactsLocalLookups.batchSize = this.batchSize;
        List<Contact> list = this.lookups;
        if (list != null) {
            mutualContactsLocalLookups.lookups = ValueObject.util_map(list, new qcj() { // from class: l.e220
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Contact) obj).mo225055clone();
                }
            });
        }
        mutualContactsLocalLookups.next = this.next;
        return mutualContactsLocalLookups;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutualContactsLocalLookups)) {
            return false;
        }
        MutualContactsLocalLookups mutualContactsLocalLookups = (MutualContactsLocalLookups) obj;
        return this.batchSize == mutualContactsLocalLookups.batchSize && ValueObject.util_equals(this.lookups, mutualContactsLocalLookups.lookups) && ValueObject.util_equals(this.next, mutualContactsLocalLookups.next);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.batchSize) * 41;
        List<Contact> list = this.lookups;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.next;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.lookups == null) {
            this.lookups = new ArrayList();
        }
    }
}
