package com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.ArrayList;
import java.util.List;
import l.avm0;
import l.d1q;
import l.d30;
import l.hce;
import l.hxs;
import l.kvc0;
import l.t100;
import l.uep0;
import l.vdt;
import l.vwb;
import l.xdl0;
import l.xlf0;
import p009l.wum0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCardGiftWallView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7429a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7430b;

    /* JADX INFO: renamed from: c */
    public TextView f7431c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f7432d;

    /* JADX INFO: renamed from: e */
    public VImage f7433e;

    /* JADX INFO: renamed from: f */
    public LiveBaseAdapter f7434f;

    public VoiceCardGiftWallView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public static String m8929g(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append(str.charAt(i));
            if (i < length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m8930d(View view) {
        avm0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m8931e() {
        this.f7429a.setController((hce) null);
        this.f7434f.Z(vwb.f0(new d1q[0]));
    }

    /* JADX INFO: renamed from: f */
    public void m8932f() {
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f7434f = liveBaseAdapter;
        this.f7432d.setAdapter(liveBaseAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f7432d.setLayoutManager(linearLayoutManager);
        this.f7432d.setHasFixedSize(true);
        this.f7432d.addItemDecoration(new xlf0(t100.d(12.0f), 0, 0));
        uep0.m(this, t100.d(10.0f));
    }

    /* JADX INFO: renamed from: h */
    public void m8933h(Act act, List<BLiveUserCardGiftWall> list, final d30 d30Var, final Action1<String> action1) {
        this.f7432d.scrollToPosition(0);
        xdl0.E0(this.f7433e, new View.OnClickListener() { // from class: l.xum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        ArrayList arrayList = new ArrayList();
        if (vwb.J(list)) {
            list = vwb.f0(new BLiveUserCardGiftWall[]{BLiveUserCardGiftWall.new_()});
        }
        BLiveUserCardGiftWall bLiveUserCardGiftWall = list.get(0);
        hxs.s("context_livingAct", this.f7429a, bLiveUserCardGiftWall.bgImage);
        hxs.s("context_livingAct", this.f7430b, bLiveUserCardGiftWall.titleBgImage);
        boolean zC = vdt.c();
        TextView textView = this.f7431c;
        if (zC) {
            textView.setRotation(90.0f);
            this.f7431c.setText(bLiveUserCardGiftWall.title);
        } else {
            textView.setText(m8929g(bLiveUserCardGiftWall.title));
        }
        this.f7431c.setTextColor(kvc0.g(bLiveUserCardGiftWall.titleColor));
        if (vwb.J(bLiveUserCardGiftWall.gifts)) {
            bLiveUserCardGiftWall.gifts = new ArrayList();
        }
        List list2 = bLiveUserCardGiftWall.gifts;
        for (int i = 0; i < list2.size(); i++) {
            final BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift = (BLiveUserCardGiftWallGift) list2.get(i);
            wum0 wum0Var = new wum0(bLiveUserCardGiftWallGift, act);
            if (TextUtils.isEmpty(bLiveUserCardGiftWallGift.id)) {
                wum0Var.A(new View.OnClickListener() { // from class: l.yum0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d30Var.call();
                    }
                });
            } else {
                wum0Var.A(new View.OnClickListener() { // from class: l.zum0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        action1.call(bLiveUserCardGiftWallGift.id);
                    }
                });
            }
            arrayList.add(wum0Var);
        }
        this.f7434f.Z(arrayList);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8930d(this);
        m8932f();
    }

    public VoiceCardGiftWallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardGiftWallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
