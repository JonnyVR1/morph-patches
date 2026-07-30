package com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall;

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
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWall;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.e30;
import p149l.hxs;
import p149l.kan0;
import p149l.mxo0;
import p149l.t100;
import p149l.vwb;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallBriefView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52314d;

    /* JADX INFO: renamed from: e */
    public VLinear f52315e;

    /* JADX INFO: renamed from: f */
    public TextView f52316f;

    /* JADX INFO: renamed from: g */
    public View f52317g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f52318h;

    /* JADX INFO: renamed from: i */
    public mxo0 f52319i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallBriefView$a */
    public class C12957a extends RecyclerView.AbstractC0576n {
        public C12957a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = t100.m186890d(17.0f);
            } else {
                rect.left = t100.m186890d(0.0f);
            }
            rect.right = t100.m186890d(20.0f);
        }
    }

    public VoiceGiftWallBriefView(Context context) {
        super(context);
    }

    private void setData(List<BLiveVoiceGiftItem> list) {
        this.f52318h.scrollToPosition(0);
        ArrayList arrayList = new ArrayList();
        if (vwb.m200296J(list)) {
            list = arrayList;
        }
        if (list.size() < 5) {
            int size = 5 - list.size();
            for (int i = 0; i < size; i++) {
                BLiveVoiceGiftItem bLiveVoiceGiftItemNew_ = BLiveVoiceGiftItem.new_();
                bLiveVoiceGiftItemNew_.f44498id = "0001";
                bLiveVoiceGiftItemNew_.name = "虚位以待";
                list.add(bLiveVoiceGiftItemNew_);
            }
        }
        mxo0 mxo0Var = this.f52319i;
        if (mxo0Var != null) {
            mxo0Var.m156916H(list);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76970h0(View view) {
        kan0.m145152a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m76971i0() {
        TextView textView = this.f52316f;
        if (textView != null) {
            textView.setText("已点亮 ");
        }
        mxo0 mxo0Var = this.f52319i;
        if (mxo0Var != null) {
            mxo0Var.m156914F();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m76972j0(e30<BLiveVoiceGiftItem> e30Var) {
        if (this.f52319i == null) {
            mxo0 mxo0Var = new mxo0(false, e30Var);
            this.f52319i = mxo0Var;
            this.f52318h.setAdapter(mxo0Var);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            this.f52318h.setLayoutManager(linearLayoutManager);
            this.f52318h.setHasFixedSize(true);
            this.f52318h.addItemDecoration(new C12957a());
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public void m76973k0(BLiveVoiceGiftWall bLiveVoiceGiftWall, e30<BLiveVoiceGiftItem> e30Var) {
        this.f52316f.setText("已点亮 " + bLiveVoiceGiftWall.process.current + "/" + bLiveVoiceGiftWall.process.total);
        m76972j0(e30Var);
        setData(bLiveVoiceGiftWall.brief.gifts);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76970h0(this);
        hxs.m133406s("context_livingAct", this.f52314d, ydt.f197624n);
    }

    public VoiceGiftWallBriefView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallBriefView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
