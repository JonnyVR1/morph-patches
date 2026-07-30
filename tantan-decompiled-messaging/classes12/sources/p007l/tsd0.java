package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.BloodType;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.Position;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l.qib0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Ll/tsd0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/tsd0$a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", BloodType.f186A, "(Landroid/view/ViewGroup;I)Ll/tsd0$a;", "getItemCount", "()I", "holder", Position.TYPE, "", "z", "(Ll/tsd0$a;I)V", "a", "Landroid/content/Context;", "", "", "b", "Ljava/util/List;", "y", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "list", "", "c", "Z", "getBlur", "()Z", "C", "(Z)V", "blur", "d", "I", "getItemSize", "D", "(I)V", "itemSize", "b_feed_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class tsd0 extends RecyclerView.Adapter<C2501a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<String> list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean blur;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int itemSize;

    /* JADX INFO: renamed from: l.tsd0$a */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll/tsd0$a;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", Data.TYPE, "", "blur", "", "a", "(Ljava/lang/String;Z)V", "Lv/VDraweeView;", "Lv/VDraweeView;", "img", "b_feed_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2501a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final VDraweeView img;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2501a(@NotNull View view) {
            super(view);
            view.getClass();
            VDraweeView vDraweeViewFindViewById = view.findViewById(b5c0.f5955D1);
            vDraweeViewFindViewById.getClass();
            this.img = vDraweeViewFindViewById;
        }

        /* JADX INFO: renamed from: a */
        public final void m14664a(@NotNull String data, boolean blur) {
            data.getClass();
            if (blur) {
                qib0.G.O(this.img, data, 2, 30);
            } else {
                qib0.G.L0(this.img, data);
            }
        }
    }

    public tsd0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.list = new ArrayList();
    }

    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C2501a onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.context).inflate(o6c0.f11348z1, parent, false);
        if (this.itemSize != 0) {
            viewInflate.getLayoutParams().width = this.itemSize;
            viewInflate.getLayoutParams().height = (this.itemSize * 6) / 5;
        }
        viewInflate.getClass();
        return new C2501a(viewInflate);
    }

    /* JADX INFO: renamed from: C */
    public final void m14660C(boolean z) {
        this.blur = z;
    }

    /* JADX INFO: renamed from: D */
    public final void m14661D(int i) {
        this.itemSize = i;
    }

    public int getItemCount() {
        return 1073741823;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final List<String> m14662y() {
        return this.list;
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C2501a holder, int position) {
        holder.getClass();
        if (this.list.isEmpty()) {
            ((RecyclerView.d0) holder).itemView.setVisibility(4);
            return;
        }
        ((RecyclerView.d0) holder).itemView.setVisibility(0);
        List<String> list = this.list;
        holder.m14664a(list.get(position % list.size()), this.blur);
    }
}
