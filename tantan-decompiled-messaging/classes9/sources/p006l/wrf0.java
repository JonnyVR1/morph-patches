package p006l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.SquareRecyclerView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item.CRBubbleItemView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item.ChatRoomBubbleItemView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item.MomentBubbleItemView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item.QCBubbleItemView;
import com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper;
import com.tantanapp.common.utils.NullChecker;
import l.dr2;
import l.e30;
import l.je50;
import l.o7r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wrf0 extends dr2<SquareDataWrapper> {

    /* JADX INFO: renamed from: d */
    public final SquareRecyclerView f25335d;

    /* JADX INFO: renamed from: e */
    public final e30<BaseBubbleItemView> f25336e;

    /* JADX INFO: renamed from: f */
    public String f25337f = "";

    public wrf0(SquareRecyclerView squareRecyclerView, e30<BaseBubbleItemView> e30Var) {
        this.f25335d = squareRecyclerView;
        this.f25336e = e30Var;
    }

    /* JADX INFO: renamed from: D */
    public View m26684D(ViewGroup viewGroup, int i) {
        SquareDataWrapper squareDataWrapperG = G(i);
        if (!NullChecker.a(squareDataWrapperG)) {
            return new View(this.f25335d.getContext());
        }
        SquareDataWrapper.Type type = squareDataWrapperG.e;
        if (type == SquareDataWrapper.Type.chatRoom) {
            return o7r.a(this.f25335d.getContext()).inflate(f6c0.f12060Xb, viewGroup, false);
        }
        if (type == SquareDataWrapper.Type.momentState) {
            return o7r.a(this.f25335d.getContext()).inflate(f6c0.f12076Yb, viewGroup, false);
        }
        if (type == SquareDataWrapper.Type.quickChat) {
            return o7r.a(this.f25335d.getContext()).inflate(f6c0.f12092Zb, viewGroup, false);
        }
        return type == SquareDataWrapper.Type.momentChatRoom ? o7r.a(this.f25335d.getContext()).inflate(f6c0.f12044Wb, viewGroup, false) : new View(this.f25335d.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m26683A(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
        this.f25335d.mo7900T(view, squareDataWrapper, i, i2);
        if (view instanceof BaseBubbleItemView) {
            ((BaseBubbleItemView) view).d(squareDataWrapper, new je50() { // from class: l.vrf0
                /* JADX INFO: renamed from: a */
                public final void m25863a() {
                    this.f24435a.notifyDataSetChanged();
                }
            });
        }
        if (view instanceof CRBubbleItemView) {
            ((CRBubbleItemView) view).m7911m(this.f25336e);
            return;
        }
        if (view instanceof MomentBubbleItemView) {
            ((MomentBubbleItemView) view).m7926l(this.f25337f, this.f25336e);
        } else if (view instanceof QCBubbleItemView) {
            ((QCBubbleItemView) view).m7933l(this.f25336e, i2);
        } else if (view instanceof ChatRoomBubbleItemView) {
            ((ChatRoomBubbleItemView) view).m7920l(this.f25336e);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m26686K(String str) {
        this.f25337f = str;
    }

    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f25335d.mo7903W(d0Var);
    }

    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f25335d.mo7904X(d0Var);
    }
}
