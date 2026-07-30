package com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWall;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.izs;
import p153l.jyb;
import p153l.ojn0;
import p153l.q6p0;
import p153l.qa00;
import p153l.y20;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallBriefView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53162d;

    /* JADX INFO: renamed from: e */
    public VLinear f53163e;

    /* JADX INFO: renamed from: f */
    public TextView f53164f;

    /* JADX INFO: renamed from: g */
    public View f53165g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f53166h;

    /* JADX INFO: renamed from: i */
    public q6p0 f53167i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallBriefView$a */
    public class C13120a extends RecyclerView.AbstractC0578n {
        public C13120a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = qa00.m175859d(17.0f);
            } else {
                rect.left = qa00.m175859d(0.0f);
            }
            rect.right = qa00.m175859d(20.0f);
        }
    }

    public VoiceGiftWallBriefView(Context context) {
        super(context);
    }

    private void setData(List<BLiveVoiceGiftItem> list) {
        this.f53166h.scrollToPosition(0);
        ArrayList arrayList = new ArrayList();
        if (jyb.m147479J(list)) {
            list = arrayList;
        }
        if (list.size() < 5) {
            int size = 5 - list.size();
            for (int i = 0; i < size; i++) {
                BLiveVoiceGiftItem bLiveVoiceGiftItemNew_ = BLiveVoiceGiftItem.new_();
                bLiveVoiceGiftItemNew_.f45346id = "0001";
                bLiveVoiceGiftItemNew_.name = "虚位以待";
                list.add(bLiveVoiceGiftItemNew_);
            }
        }
        q6p0 q6p0Var = this.f53167i;
        if (q6p0Var != null) {
            q6p0Var.m175599H(list);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78153h0(View view) {
        ojn0.m167868a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78154i0() {
        TextView textView = this.f53164f;
        if (textView != null) {
            textView.setText("已点亮 ");
        }
        q6p0 q6p0Var = this.f53167i;
        if (q6p0Var != null) {
            q6p0Var.m175597F();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78155j0(y20<BLiveVoiceGiftItem> y20Var) {
        if (this.f53167i == null) {
            q6p0 q6p0Var = new q6p0(false, y20Var);
            this.f53167i = q6p0Var;
            this.f53166h.setAdapter(q6p0Var);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            this.f53166h.setLayoutManager(linearLayoutManager);
            this.f53166h.setHasFixedSize(true);
            this.f53166h.addItemDecoration(new C13120a());
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public void m78156k0(BLiveVoiceGiftWall bLiveVoiceGiftWall, y20<BLiveVoiceGiftItem> y20Var) {
        this.f53164f.setText("已点亮 " + bLiveVoiceGiftWall.process.current + "/" + bLiveVoiceGiftWall.process.total);
        m78155j0(y20Var);
        setData(bLiveVoiceGiftWall.brief.gifts);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78153h0(this);
        izs.m142868s("context_livingAct", this.f53162d, zft.f204219n);
    }

    public VoiceGiftWallBriefView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallBriefView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
