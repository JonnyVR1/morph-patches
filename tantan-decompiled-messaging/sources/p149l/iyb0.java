package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00072\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/iyb0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/iyb0$a;", "", "", "texts", "Lkotlin/Function1;", "", "onTextClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "A", "(Landroid/view/ViewGroup;I)Ll/iyb0$a;", "holder", "position", BaseSei.f13932Z, "(Ll/iyb0$a;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Lkotlin/jvm/functions/Function1;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class iyb0 extends RecyclerView.Adapter<C17644a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<String> texts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<String, Unit> onTextClick;

    /* JADX INFO: renamed from: l.iyb0$a */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/iyb0$a;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Ll/iyb0;Landroid/view/View;)V", "", "text", "", "b", "(Ljava/lang/String;)V", "Lv/VText;", "a", "Lv/VText;", "textView", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class C17644a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final VText textView;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ iyb0 f115445b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17644a(@NotNull iyb0 iyb0Var, View view) {
            super(view);
            view.getClass();
            this.f115445b = iyb0Var;
            View viewFindViewById = view.findViewById(u4c0.f174299ib);
            viewFindViewById.getClass();
            this.textView = (VText) viewFindViewById;
        }

        /* JADX INFO: renamed from: a */
        public static void m138960a(iyb0 iyb0Var, String str, View view) {
            iyb0Var.onTextClick.invoke(str);
        }

        /* JADX INFO: renamed from: b */
        public final void m138961b(@NotNull final String text) {
            text.getClass();
            this.textView.setText(text);
            View view = this.itemView;
            final iyb0 iyb0Var = this.f115445b;
            view.setOnClickListener(new View.OnClickListener() { // from class: l.hyb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iyb0.C17644a.m138960a(iyb0Var, text, view2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iyb0(@NotNull List<String> list, @NotNull Function1<? super String, Unit> function1) {
        list.getClass();
        function1.getClass();
        this.texts = list;
        this.onTextClick = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C17644a onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f6c0.f96107z1, parent, false);
        viewInflate.getClass();
        return new C17644a(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.texts.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C17644a holder, int position) {
        holder.getClass();
        holder.m138961b(this.texts.get(position));
    }
}
