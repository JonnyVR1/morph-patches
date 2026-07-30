package com.p000p1.mobile.putong.core.p001ui.compliment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.data.Item;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.compliment.ComplimentPhotoAdapter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.f6c0;
import l.l9r;
import l.qib0;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004):'+B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\t2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\"\u001a\u00020\t2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010.R\u0016\u00109\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$c;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "user", "Lkotlin/Function1;", "", "", "onPhotoClick", "initialPhotoIndex", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Lkotlin/jvm/functions/Function1;I)V", "position", "G", "(I)V", "C", "()I", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$TabMode;", "mode", "H", "(Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$TabMode;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "F", "(Landroid/view/ViewGroup;I)Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$c;", "holder", "D", "(Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$c;I)V", "", "", "payloads", "E", "(Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$c;ILjava/util/List;)V", "getItemCount", "A", "()V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/data/User;", "c", "Lkotlin/jvm/functions/Function1;", "d", "I", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$b;", "e", "Ljava/util/List;", "items", "f", "originalIndices", "g", "selectedPosition", "h", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$TabMode;", "currentTabMode", "TabMode", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class ComplimentPhotoAdapter extends RecyclerView.Adapter<C3078c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final User user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<Integer, Unit> onPhotoClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int initialPhotoIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<C3077b> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<Integer> originalIndices;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int selectedPosition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public TabMode currentTabMode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$TabMode;", "", "<init>", "(Ljava/lang/String;I)V", "COMPLIMENT", "WHISPER", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public enum TabMode {
        COMPLIMENT,
        WHISPER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<TabMode> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.ComplimentPhotoAdapter$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$a;", "", "<init>", "()V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3076a {

        @NotNull
        public static final C3076a INSTANCE = new C3076a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.ComplimentPhotoAdapter$b */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$b;", "", "Lcom/p1/mobile/putong/data/Picture;", "picture", "<init>", "(Lcom/p1/mobile/putong/data/Picture;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/data/Picture;", "()Lcom/p1/mobile/putong/data/Picture;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final /* data */ class C3077b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Picture picture;

        public C3077b(@NotNull Picture picture) {
            picture.getClass();
            this.picture = picture;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Picture getPicture() {
            return this.picture;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C3077b) && Intrinsics.d(this.picture, ((C3077b) other).picture);
        }

        public int hashCode() {
            return this.picture.hashCode();
        }

        @NotNull
        public String toString() {
            return "PhotoItem(picture=" + this.picture + ")";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.ComplimentPhotoAdapter$c */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$c;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$b;", Item.TYPE, "", "isSelected", "", "b", "(Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter$b;Z)V", "c", "(Z)V", "Lv/AutoVDraweeView;", "a", "Lv/AutoVDraweeView;", "photoView", "Landroid/view/View;", "selectedBorder", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public final class C3078c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AutoVDraweeView photoView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final View selectedBorder;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ComplimentPhotoAdapter f1128c;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.ComplimentPhotoAdapter$c$a */
        @Metadata(k = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f1129a;

            static {
                int[] iArr = new int[TabMode.values().length];
                try {
                    iArr[TabMode.COMPLIMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TabMode.WHISPER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f1129a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3078c(@NotNull ComplimentPhotoAdapter complimentPhotoAdapter, View view) {
            super(view);
            view.getClass();
            this.f1128c = complimentPhotoAdapter;
            AutoVDraweeView autoVDraweeViewFindViewById = view.findViewById(u4c0.w9);
            autoVDraweeViewFindViewById.getClass();
            this.photoView = autoVDraweeViewFindViewById;
            View viewFindViewById = view.findViewById(u4c0.Wb);
            viewFindViewById.getClass();
            this.selectedBorder = viewFindViewById;
        }

        /* JADX INFO: renamed from: a */
        public static void m1934a(ComplimentPhotoAdapter complimentPhotoAdapter, C3078c c3078c, View view) {
            complimentPhotoAdapter.onPhotoClick.invoke(Integer.valueOf(c3078c.getAdapterPosition()));
        }

        /* JADX INFO: renamed from: b */
        public final void m1935b(@NotNull C3077b item, boolean isSelected) {
            item.getClass();
            qib0.G.J0(this.photoView, item.getPicture().profile480(), false);
            m1936c(isSelected);
            View view = ((RecyclerView.d0) this).itemView;
            final ComplimentPhotoAdapter complimentPhotoAdapter = this.f1128c;
            view.setOnClickListener(new View.OnClickListener() { // from class: l.wq5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ComplimentPhotoAdapter.C3078c.m1934a(complimentPhotoAdapter, this, view2);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final void m1936c(boolean isSelected) {
            int i;
            if (!isSelected) {
                xdl0.M(this.selectedBorder, false);
                return;
            }
            int i2 = a.f1129a[this.f1128c.currentTabMode.ordinal()];
            if (i2 == 1) {
                i = x2c0.f1;
            } else {
                if (i2 != 2) {
                    l9r.a();
                    return;
                }
                i = x2c0.g1;
            }
            this.selectedBorder.setBackgroundResource(i);
            xdl0.M(this.selectedBorder, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComplimentPhotoAdapter(@NotNull Act act, @NotNull User user, @NotNull Function1<? super Integer, Unit> function1, int i) {
        act.getClass();
        user.getClass();
        function1.getClass();
        this.act = act;
        this.user = user;
        this.onPhotoClick = function1;
        this.initialPhotoIndex = i;
        this.items = new ArrayList();
        this.originalIndices = new ArrayList();
        this.currentTabMode = TabMode.COMPLIMENT;
        m1926A();
    }

    /* JADX INFO: renamed from: A */
    public final void m1926A() {
        this.items.clear();
        this.originalIndices.clear();
        List list = this.user.pictures;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i = this.initialPhotoIndex;
        int i2 = 0;
        if (i < 0 || i >= size) {
            int size2 = list.size();
            while (i2 < size2) {
                List<C3077b> list2 = this.items;
                Picture pictureCover = ((Media) list.get(i2)).cover();
                pictureCover.getClass();
                list2.add(new C3077b(pictureCover));
                this.originalIndices.add(Integer.valueOf(i2));
                i2++;
            }
            return;
        }
        List<C3077b> list3 = this.items;
        Picture pictureCover2 = ((Media) list.get(i)).cover();
        pictureCover2.getClass();
        list3.add(new C3077b(pictureCover2));
        this.originalIndices.add(Integer.valueOf(this.initialPhotoIndex));
        int size3 = list.size();
        while (i2 < size3) {
            if (i2 != this.initialPhotoIndex) {
                List<C3077b> list4 = this.items;
                Picture pictureCover3 = ((Media) list.get(i2)).cover();
                pictureCover3.getClass();
                list4.add(new C3077b(pictureCover3));
                this.originalIndices.add(Integer.valueOf(i2));
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m1927C() {
        int size = this.originalIndices.size();
        int i = this.selectedPosition;
        if (i < 0 || i >= size) {
            return 0;
        }
        return this.originalIndices.get(i).intValue();
    }

    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C3078c holder, int position) {
        holder.getClass();
        holder.m1935b(this.items.get(position), position == this.selectedPosition);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C3078c holder, int position, @NotNull List<Object> payloads) {
        holder.getClass();
        payloads.getClass();
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
        } else {
            holder.m1936c(position == this.selectedPosition);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C3078c onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f6c0.y1, parent, false);
        viewInflate.getClass();
        return new C3078c(this, viewInflate);
    }

    /* JADX INFO: renamed from: G */
    public final void m1931G(int position) {
        int i = this.selectedPosition;
        this.selectedPosition = position;
        C3076a c3076a = C3076a.INSTANCE;
        notifyItemChanged(i, c3076a);
        notifyItemChanged(this.selectedPosition, c3076a);
    }

    /* JADX INFO: renamed from: H */
    public final void m1932H(@NotNull TabMode mode) {
        mode.getClass();
        if (this.currentTabMode != mode) {
            this.currentTabMode = mode;
            notifyItemChanged(this.selectedPosition, C3076a.INSTANCE);
        }
    }

    public int getItemCount() {
        return this.items.size();
    }
}
