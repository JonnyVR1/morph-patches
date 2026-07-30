package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.hello;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.NearbyOnline;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.ujh;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedNearbyOnlineView extends VRelative {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f42482d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f42483e;

    /* JADX INFO: renamed from: f */
    public VLinear f42484f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f42485g;

    /* JADX INFO: renamed from: h */
    public VLinear f42486h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f42487i;

    /* JADX INFO: renamed from: j */
    public VLinear f42488j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f42489k;

    /* JADX INFO: renamed from: l */
    public VImage f42490l;

    /* JADX INFO: renamed from: m */
    public VText f42491m;

    public FeedNearbyOnlineView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m65573z(View view) {
        i4g0.m138520r("e_nearby_online", OMSDialogPositon.p_nearby);
        getContext().startActivity(new Intent(getContext(), (Class<?>) FeedHelloNearbyOnlineAct.class));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B */
    public void m65574B(NearbyOnline nearbyOnline) {
        m65575H(nearbyOnline);
        this.f42491m.setText("附近 " + nearbyOnline.userCount + " 人在线");
        bnl0.m105524M(this.f42482d, true);
        bnl0.m105509E0(this.f42482d, new View.OnClickListener() { // from class: l.tjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174588a.m65573z(view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m65575H(NearbyOnline nearbyOnline) {
        bnl0.m105524M(this.f42483e, true);
        if (nearbyOnline == null) {
            return;
        }
        int size = nearbyOnline.userIds.size();
        if (size == 1) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(nearbyOnline.userIds.get(0));
            if (userM145688e8 == null) {
                return;
            }
            uqb0.f180374G.m127125Q0(this.f42485g, userM145688e8.m61308fp().profileSmall());
            bnl0.m105524M(this.f42484f, true);
            bnl0.m105524M(this.f42486h, false);
            bnl0.m105524M(this.f42488j, false);
            return;
        }
        List<String> list = nearbyOnline.userIds;
        if (size == 2) {
            User userM145688e9 = FeedModule.f39703d.m145688e8(list.get(0));
            User userM145688e10 = FeedModule.f39703d.m145688e8(nearbyOnline.userIds.get(1));
            if (userM145688e9 == null && userM145688e10 == null) {
                return;
            }
            if (userM145688e9 == null || userM145688e10 == null) {
                uqb0.f180374G.m127125Q0(this.f42485g, (userM145688e9 == null ? userM145688e10.m61308fp() : userM145688e9.m61308fp()).profileSmall());
                bnl0.m105524M(this.f42484f, true);
                bnl0.m105524M(this.f42486h, false);
                bnl0.m105524M(this.f42488j, false);
                return;
            }
            uqb0.f180374G.m127125Q0(this.f42485g, userM145688e10.m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f42487i, userM145688e9.m61308fp().profileSmall());
            bnl0.m105524M(this.f42484f, true);
            bnl0.m105524M(this.f42486h, true);
            bnl0.m105524M(this.f42488j, false);
            return;
        }
        User userM145688e11 = FeedModule.f39703d.m145688e8(list.get(0));
        User userM145688e12 = FeedModule.f39703d.m145688e8(nearbyOnline.userIds.get(1));
        User userM145688e13 = FeedModule.f39703d.m145688e8(nearbyOnline.userIds.get(2));
        if (userM145688e11 == null && userM145688e12 == null && userM145688e13 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(userM145688e11)) {
            arrayList.add(userM145688e11);
        }
        if (NullChecker.m82486a(userM145688e12)) {
            arrayList.add(userM145688e12);
        }
        if (NullChecker.m82486a(userM145688e13)) {
            arrayList.add(userM145688e13);
        }
        if (arrayList.size() == 1) {
            uqb0.f180374G.m127125Q0(this.f42485g, ((User) arrayList.get(0)).m61308fp().profileSmall());
            bnl0.m105524M(this.f42484f, true);
            bnl0.m105524M(this.f42486h, false);
            bnl0.m105524M(this.f42488j, false);
        }
        if (arrayList.size() == 2) {
            uqb0.f180374G.m127125Q0(this.f42485g, ((User) arrayList.get(0)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f42487i, ((User) arrayList.get(1)).m61308fp().profileSmall());
            bnl0.m105524M(this.f42484f, true);
            bnl0.m105524M(this.f42486h, true);
            bnl0.m105524M(this.f42488j, false);
        }
        if (arrayList.size() == 3) {
            uqb0.f180374G.m127125Q0(this.f42485g, ((User) arrayList.get(0)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f42487i, ((User) arrayList.get(1)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f42489k, ((User) arrayList.get(2)).m61308fp().profileSmall());
            bnl0.m105524M(this.f42484f, true);
            bnl0.m105524M(this.f42486h, true);
            bnl0.m105524M(this.f42488j, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m65576q(this);
        bnl0.m105524M(this.f42482d, false);
    }

    /* JADX INFO: renamed from: q */
    public final void m65576q(View view) {
        ujh.m196370a(this, view);
    }

    public FeedNearbyOnlineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedNearbyOnlineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
