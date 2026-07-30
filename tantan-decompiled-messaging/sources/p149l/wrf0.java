package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.SquareRecyclerView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.CRBubbleItemView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.ChatRoomBubbleItemView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.MomentBubbleItemView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.QCBubbleItemView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class wrf0 extends dr2<SquareDataWrapper> {

    /* JADX INFO: renamed from: d */
    public final SquareRecyclerView f187792d;

    /* JADX INFO: renamed from: e */
    public final e30<BaseBubbleItemView> f187793e;

    /* JADX INFO: renamed from: f */
    public String f187794f = "";

    public wrf0(SquareRecyclerView squareRecyclerView, e30<BaseBubbleItemView> e30Var) {
        this.f187792d = squareRecyclerView;
        this.f187793e = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        SquareDataWrapper item = getItem(i);
        if (!NullChecker.m81303a(item)) {
            return new View(this.f187792d.getContext());
        }
        SquareDataWrapper.Type type = item.f32660e;
        if (type == SquareDataWrapper.Type.chatRoom) {
            return o7r.m163037a(this.f187792d.getContext()).inflate(f6c0.f95646Xb, viewGroup, false);
        }
        if (type == SquareDataWrapper.Type.momentState) {
            return o7r.m163037a(this.f187792d.getContext()).inflate(f6c0.f95662Yb, viewGroup, false);
        }
        if (type == SquareDataWrapper.Type.quickChat) {
            return o7r.m163037a(this.f187792d.getContext()).inflate(f6c0.f95678Zb, viewGroup, false);
        }
        return type == SquareDataWrapper.Type.momentChatRoom ? o7r.m163037a(this.f187792d.getContext()).inflate(f6c0.f95630Wb, viewGroup, false) : new View(this.f187792d.getContext());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
        this.f187792d.mo54557T(view, squareDataWrapper, i, i2);
        if (view instanceof BaseBubbleItemView) {
            ((BaseBubbleItemView) view).m80118d(squareDataWrapper, new je50() { // from class: l.vrf0
                @Override // p149l.je50
                /* JADX INFO: renamed from: a */
                public final void mo141101a() {
                    this.f182718a.notifyDataSetChanged();
                }
            });
        }
        if (view instanceof CRBubbleItemView) {
            ((CRBubbleItemView) view).m54568m(this.f187793e);
            return;
        }
        if (view instanceof MomentBubbleItemView) {
            ((MomentBubbleItemView) view).m54579l(this.f187794f, this.f187793e);
        } else if (view instanceof QCBubbleItemView) {
            ((QCBubbleItemView) view).m54584l(this.f187793e, i2);
        } else if (view instanceof ChatRoomBubbleItemView) {
            ((ChatRoomBubbleItemView) view).m54575l(this.f187793e);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m205182K(String str) {
        this.f187794f = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f187792d.mo54560W(abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f187792d.mo54561X(abstractC0566d0);
    }
}
