package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Contact;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class MutualContactsLocalLookups extends ValueObject implements Cloneable, Serializable {
    public static ProtobufAdapter<MutualContactsLocalLookups> PROTOBUF_ADAPTER = new MessageNanoAdapter<MutualContactsLocalLookups>() { // from class: com.p1.mobile.putong.data.MutualContactsLocalLookups.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MutualContactsLocalLookups mutualContactsLocalLookups) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, mutualContactsLocalLookups.batchSize);
            List<Contact> list = mutualContactsLocalLookups.lookups;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = mutualContactsLocalLookups.next;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str);
            }
            mutualContactsLocalLookups.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MutualContactsLocalLookups parse(nb5 nb5Var) throws IOException {
            MutualContactsLocalLookups mutualContactsLocalLookups = new MutualContactsLocalLookups();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (mutualContactsLocalLookups.lookups != null) {
                        break;
                    }
                    mutualContactsLocalLookups.lookups = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    mutualContactsLocalLookups.batchSize = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    mutualContactsLocalLookups.lookups = (List) nb5Var.m158743l(Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (mutualContactsLocalLookups.lookups != null) {
                            break;
                        }
                        mutualContactsLocalLookups.lookups = new ArrayList();
                        return mutualContactsLocalLookups;
                    }
                    mutualContactsLocalLookups.next = nb5Var.m158750s();
                }
            }
            return mutualContactsLocalLookups;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MutualContactsLocalLookups mutualContactsLocalLookups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, mutualContactsLocalLookups.batchSize);
            List<Contact> list = mutualContactsLocalLookups.lookups;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = mutualContactsLocalLookups.next;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
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
    public MutualContactsLocalLookups mo223809clone() {
        MutualContactsLocalLookups mutualContactsLocalLookups = new MutualContactsLocalLookups();
        mutualContactsLocalLookups.batchSize = this.batchSize;
        List<Contact> list = this.lookups;
        if (list != null) {
            mutualContactsLocalLookups.lookups = ValueObject.util_map(list, new w9j() { // from class: l.wt10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Contact) obj).mo223809clone();
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
