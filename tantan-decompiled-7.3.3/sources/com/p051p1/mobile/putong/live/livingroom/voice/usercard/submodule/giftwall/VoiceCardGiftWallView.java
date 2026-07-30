package com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.a4n0;
import p153l.bnl0;
import p153l.d3q;
import p153l.e4n0;
import p153l.guf0;
import p153l.izs;
import p153l.jyb;
import p153l.n3d0;
import p153l.qa00;
import p153l.wft;
import p153l.x20;
import p153l.ynp0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceCardGiftWallView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54671a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54672b;

    /* JADX INFO: renamed from: c */
    public TextView f54673c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f54674d;

    /* JADX INFO: renamed from: e */
    public VImage f54675e;

    /* JADX INFO: renamed from: f */
    public LiveBaseAdapter f54676f;

    public VoiceCardGiftWallView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public static String m79896g(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append(str.charAt(i));
            if (i < length - 1) {
                sb.append(SignParameters.NEW_LINE);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m79897d(View view) {
        e4n0.m119456a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m79898e() {
        this.f54671a.setController(null);
        this.f54676f.m68554Z(jyb.m147507f0(new d3q[0]));
    }

    /* JADX INFO: renamed from: f */
    public void m79899f() {
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f54676f = liveBaseAdapter;
        this.f54674d.setAdapter(liveBaseAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f54674d.setLayoutManager(linearLayoutManager);
        this.f54674d.setHasFixedSize(true);
        this.f54674d.addItemDecoration(new guf0(qa00.m175859d(12.0f), 0, 0));
        ynp0.m216936m(this, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: h */
    public void m79900h(Act act, List<BLiveUserCardGiftWall> list, final x20 x20Var, final Action1<String> action1) {
        this.f54674d.scrollToPosition(0);
        bnl0.m105509E0(this.f54675e, new View.OnClickListener() { // from class: l.b4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        ArrayList arrayList = new ArrayList();
        if (jyb.m147479J(list)) {
            list = jyb.m147507f0(BLiveUserCardGiftWall.new_());
        }
        BLiveUserCardGiftWall bLiveUserCardGiftWall = list.get(0);
        izs.m142868s("context_livingAct", this.f54671a, bLiveUserCardGiftWall.bgImage);
        izs.m142868s("context_livingAct", this.f54672b, bLiveUserCardGiftWall.titleBgImage);
        boolean zM206160c = wft.m206160c();
        TextView textView = this.f54673c;
        if (zM206160c) {
            textView.setRotation(90.0f);
            this.f54673c.setText(bLiveUserCardGiftWall.title);
        } else {
            textView.setText(m79896g(bLiveUserCardGiftWall.title));
        }
        this.f54673c.setTextColor(n3d0.m161283g(bLiveUserCardGiftWall.titleColor));
        if (jyb.m147479J(bLiveUserCardGiftWall.gifts)) {
            bLiveUserCardGiftWall.gifts = new ArrayList();
        }
        List<BLiveUserCardGiftWallGift> list2 = bLiveUserCardGiftWall.gifts;
        for (int i = 0; i < list2.size(); i++) {
            final BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift = list2.get(i);
            a4n0 a4n0Var = new a4n0(bLiveUserCardGiftWallGift, act);
            if (TextUtils.isEmpty(bLiveUserCardGiftWallGift.f45317id)) {
                a4n0Var.mo113881A(new View.OnClickListener() { // from class: l.c4n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        x20Var.call();
                    }
                });
            } else {
                a4n0Var.mo113881A(new View.OnClickListener() { // from class: l.d4n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        action1.call(bLiveUserCardGiftWallGift.f45317id);
                    }
                });
            }
            arrayList.add(a4n0Var);
        }
        this.f54676f.m68554Z(arrayList);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79897d(this);
        m79899f();
    }

    public VoiceCardGiftWallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardGiftWallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
