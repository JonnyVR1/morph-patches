package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Contact;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MutualContactsLocalLookups extends ValueObject implements Cloneable, Serializable {
    public static ProtobufAdapter<MutualContactsLocalLookups> PROTOBUF_ADAPTER = new MessageNanoAdapter<MutualContactsLocalLookups>() { // from class: com.p1.mobile.putong.data.MutualContactsLocalLookups.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MutualContactsLocalLookups mutualContactsLocalLookups) {
            int iH = CodedOutputByteBufferNano.h(1, mutualContactsLocalLookups.batchSize);
            List<Contact> list = mutualContactsLocalLookups.lookups;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = mutualContactsLocalLookups.next;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) mutualContactsLocalLookups).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MutualContactsLocalLookups m18504parse(nb5 nb5Var) throws IOException {
            MutualContactsLocalLookups mutualContactsLocalLookups = new MutualContactsLocalLookups();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (mutualContactsLocalLookups.lookups != null) {
                        break;
                    }
                    mutualContactsLocalLookups.lookups = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    mutualContactsLocalLookups.batchSize = nb5Var.j();
                } else if (iU == 18) {
                    mutualContactsLocalLookups.lookups = (List) nb5Var.l(Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (mutualContactsLocalLookups.lookups != null) {
                            break;
                        }
                        mutualContactsLocalLookups.lookups = new ArrayList();
                        return mutualContactsLocalLookups;
                    }
                    mutualContactsLocalLookups.next = nb5Var.s();
                }
            }
            return mutualContactsLocalLookups;
        }

        public void serialize(MutualContactsLocalLookups mutualContactsLocalLookups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, mutualContactsLocalLookups.batchSize);
            List<Contact> list = mutualContactsLocalLookups.lookups;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = mutualContactsLocalLookups.next;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
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

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MutualContactsLocalLookups m18503clone() {
        MutualContactsLocalLookups mutualContactsLocalLookups = new MutualContactsLocalLookups();
        mutualContactsLocalLookups.batchSize = this.batchSize;
        List<Contact> list = this.lookups;
        if (list != null) {
            mutualContactsLocalLookups.lookups = ValueObject.util_map(list, new w9j() { // from class: l.wt10
                public final Object call(Object obj) {
                    return ((Contact) obj).m17847clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.batchSize) * 41;
        List<Contact> list = this.lookups;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.next;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.lookups == null) {
            this.lookups = new ArrayList();
        }
    }
}
