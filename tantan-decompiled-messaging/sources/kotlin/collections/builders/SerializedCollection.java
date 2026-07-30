package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.sie0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m87232d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "collection", "", "tag", "", "<init>", "(Ljava/util/Collection;I)V", "()V", "writeExternal", "", "output", "Ljava/io/ObjectOutput;", "readExternal", "input", "Ljava/io/ObjectInput;", "readResolve", "", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    @NotNull
    private Collection<?> collection;
    private final int tag;

    public SerializedCollection(@NotNull Collection<?> collection, int i) {
        collection.getClass();
        this.collection = collection;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) throws IOException {
        List listBuild;
        input.getClass();
        byte b = input.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            sie0.m184336a("Unsupported flags value: ", b);
            return;
        }
        int i2 = input.readInt();
        if (i2 < 0) {
            sie0.m184336a("Illegal size value: ", i2);
            return;
        }
        int i3 = 0;
        if (i == 0) {
            List listCreateListBuilder = CollectionsKt.createListBuilder(i2);
            while (i3 < i2) {
                listCreateListBuilder.add(input.readObject());
                i3++;
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        } else {
            if (i != 1) {
                sie0.m184336a("Unsupported collection type tag: ", i);
                return;
            }
            Set setCreateSetBuilder = SetsKt.createSetBuilder(i2);
            while (i3 < i2) {
                setCreateSetBuilder.add(input.readObject());
                i3++;
            }
            listBuild = SetsKt.build(setCreateSetBuilder);
        }
        this.collection = listBuild;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        output.getClass();
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(CollectionsKt.emptyList(), 0);
    }
}
