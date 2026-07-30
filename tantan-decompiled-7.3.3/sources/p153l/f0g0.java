package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.SquareRecyclerView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.CRBubbleItemView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.ChatRoomBubbleItemView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.MomentBubbleItemView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.QCBubbleItemView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class f0g0 extends tr2<SquareDataWrapper> {

    /* JADX INFO: renamed from: d */
    public final SquareRecyclerView f96676d;

    /* JADX INFO: renamed from: e */
    public final y20<BaseBubbleItemView> f96677e;

    /* JADX INFO: renamed from: f */
    public String f96678f = "";

    public f0g0(SquareRecyclerView squareRecyclerView, y20<BaseBubbleItemView> y20Var) {
        this.f96676d = squareRecyclerView;
        this.f96677e = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        SquareDataWrapper item = getItem(i);
        if (!NullChecker.m82486a(item)) {
            return new View(this.f96676d.getContext());
        }
        SquareDataWrapper.Type type = item.f33508e;
        if (type == SquareDataWrapper.Type.chatRoom) {
            return p9r.m171370a(this.f96676d.getContext()).inflate(kec0.f125817ec, viewGroup, false);
        }
        if (type == SquareDataWrapper.Type.momentState) {
            return p9r.m171370a(this.f96676d.getContext()).inflate(kec0.f125834fc, viewGroup, false);
        }
        if (type == SquareDataWrapper.Type.quickChat) {
            return p9r.m171370a(this.f96676d.getContext()).inflate(kec0.f125851gc, viewGroup, false);
        }
        return type == SquareDataWrapper.Type.momentChatRoom ? p9r.m171370a(this.f96676d.getContext()).inflate(kec0.f125800dc, viewGroup, false) : new View(this.f96676d.getContext());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
        this.f96676d.mo55740T(view, squareDataWrapper, i, i2);
        if (view instanceof BaseBubbleItemView) {
            ((BaseBubbleItemView) view).m81301d(squareDataWrapper, new qm50() { // from class: l.e0g0
                @Override // p153l.qm50
                /* JADX INFO: renamed from: a */
                public final void mo118859a() {
                    this.f91462a.notifyDataSetChanged();
                }
            });
        }
        if (view instanceof CRBubbleItemView) {
            ((CRBubbleItemView) view).m55751m(this.f96677e);
            return;
        }
        if (view instanceof MomentBubbleItemView) {
            ((MomentBubbleItemView) view).m55762l(this.f96678f, this.f96677e);
        } else if (view instanceof QCBubbleItemView) {
            ((QCBubbleItemView) view).m55767l(this.f96677e, i2);
        } else if (view instanceof ChatRoomBubbleItemView) {
            ((ChatRoomBubbleItemView) view).m55758l(this.f96677e);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m123486K(String str) {
        this.f96678f = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f96676d.mo55743W(abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f96676d.mo55744X(abstractC0569e0);
    }
}
