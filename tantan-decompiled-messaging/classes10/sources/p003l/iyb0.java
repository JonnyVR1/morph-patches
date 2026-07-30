package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.f6c0;
import l.u4c0;
import org.jetbrains.annotations.NotNull;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00072\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll/iyb0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/iyb0$a;", "", "", "texts", "Lkotlin/Function1;", "", "onTextClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "A", "(Landroid/view/ViewGroup;I)Ll/iyb0$a;", "holder", "position", "z", "(Ll/iyb0$a;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Lkotlin/jvm/functions/Function1;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class iyb0 extends RecyclerView.Adapter<C3351a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<String> texts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<String, Unit> onTextClick;

    /* JADX INFO: renamed from: l.iyb0$a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ll/iyb0$a;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Ll/iyb0;Landroid/view/View;)V", "", "text", "", "b", "(Ljava/lang/String;)V", "Lv/VText;", "a", "Lv/VText;", "textView", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public final class C3351a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final VText textView;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ iyb0 f5229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3351a(@NotNull iyb0 iyb0Var, View view) {
            super(view);
            view.getClass();
            this.f5229b = iyb0Var;
            VText vTextFindViewById = view.findViewById(u4c0.ib);
            vTextFindViewById.getClass();
            this.textView = vTextFindViewById;
        }

        /* JADX INFO: renamed from: a */
        public static void m7312a(iyb0 iyb0Var, String str, View view) {
            iyb0Var.onTextClick.invoke(str);
        }

        /* JADX INFO: renamed from: b */
        public final void m7313b(@NotNull final String text) {
            text.getClass();
            this.textView.setText(text);
            View view = ((RecyclerView.d0) this).itemView;
            final iyb0 iyb0Var = this.f5229b;
            view.setOnClickListener(new View.OnClickListener() { // from class: l.hyb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iyb0.C3351a.m7312a(iyb0Var, text, view2);
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

    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C3351a onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f6c0.z1, parent, false);
        viewInflate.getClass();
        return new C3351a(this, viewInflate);
    }

    public int getItemCount() {
        return this.texts.size();
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C3351a holder, int position) {
        holder.getClass();
        holder.m7313b(this.texts.get(position));
    }
}
