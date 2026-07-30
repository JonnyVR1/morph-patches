package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.hello;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.NearbyOnline;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.qib0;
import l.xdl0;
import l.zvf0;
import p007l.fih;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedNearbyOnlineView extends VRelative {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f3095d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f3096e;

    /* JADX INFO: renamed from: f */
    public VLinear f3097f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f3098g;

    /* JADX INFO: renamed from: h */
    public VLinear f3099h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f3100i;

    /* JADX INFO: renamed from: j */
    public VLinear f3101j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f3102k;

    /* JADX INFO: renamed from: l */
    public VImage f3103l;

    /* JADX INFO: renamed from: m */
    public VText f3104m;

    public FeedNearbyOnlineView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m5468z(View view) {
        zvf0.r("e_nearby_online", OMSDialogPositon.p_nearby);
        getContext().startActivity(new Intent(getContext(), (Class<?>) FeedHelloNearbyOnlineAct.class));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B */
    public void m5469B(NearbyOnline nearbyOnline) {
        m5470H(nearbyOnline);
        this.f3104m.setText("附近 " + nearbyOnline.userCount + " 人在线");
        xdl0.M(this.f3095d, true);
        xdl0.E0(this.f3095d, new View.OnClickListener() { // from class: l.eih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7400a.m5468z(view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m5470H(NearbyOnline nearbyOnline) {
        xdl0.M(this.f3096e, true);
        if (nearbyOnline == null) {
            return;
        }
        int size = nearbyOnline.userIds.size();
        if (size == 1) {
            User userM16628e8 = FeedModule.f316d.m16628e8(nearbyOnline.userIds.get(0));
            if (userM16628e8 == null) {
                return;
            }
            qib0.G.Q0(this.f3098g, userM16628e8.m1042fp().profileSmall());
            xdl0.M(this.f3097f, true);
            xdl0.M(this.f3099h, false);
            xdl0.M(this.f3101j, false);
            return;
        }
        List<String> list = nearbyOnline.userIds;
        if (size == 2) {
            User userM16628e9 = FeedModule.f316d.m16628e8(list.get(0));
            User userM16628e10 = FeedModule.f316d.m16628e8(nearbyOnline.userIds.get(1));
            if (userM16628e9 == null && userM16628e10 == null) {
                return;
            }
            if (userM16628e9 == null || userM16628e10 == null) {
                qib0.G.Q0(this.f3098g, (userM16628e9 == null ? userM16628e10.m1042fp() : userM16628e9.m1042fp()).profileSmall());
                xdl0.M(this.f3097f, true);
                xdl0.M(this.f3099h, false);
                xdl0.M(this.f3101j, false);
                return;
            }
            qib0.G.Q0(this.f3098g, userM16628e10.m1042fp().profileSmall());
            qib0.G.Q0(this.f3100i, userM16628e9.m1042fp().profileSmall());
            xdl0.M(this.f3097f, true);
            xdl0.M(this.f3099h, true);
            xdl0.M(this.f3101j, false);
            return;
        }
        User userM16628e11 = FeedModule.f316d.m16628e8(list.get(0));
        User userM16628e12 = FeedModule.f316d.m16628e8(nearbyOnline.userIds.get(1));
        User userM16628e13 = FeedModule.f316d.m16628e8(nearbyOnline.userIds.get(2));
        if (userM16628e11 == null && userM16628e12 == null && userM16628e13 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(userM16628e11)) {
            arrayList.add(userM16628e11);
        }
        if (NullChecker.a(userM16628e12)) {
            arrayList.add(userM16628e12);
        }
        if (NullChecker.a(userM16628e13)) {
            arrayList.add(userM16628e13);
        }
        if (arrayList.size() == 1) {
            qib0.G.Q0(this.f3098g, ((User) arrayList.get(0)).m1042fp().profileSmall());
            xdl0.M(this.f3097f, true);
            xdl0.M(this.f3099h, false);
            xdl0.M(this.f3101j, false);
        }
        if (arrayList.size() == 2) {
            qib0.G.Q0(this.f3098g, ((User) arrayList.get(0)).m1042fp().profileSmall());
            qib0.G.Q0(this.f3100i, ((User) arrayList.get(1)).m1042fp().profileSmall());
            xdl0.M(this.f3097f, true);
            xdl0.M(this.f3099h, true);
            xdl0.M(this.f3101j, false);
        }
        if (arrayList.size() == 3) {
            qib0.G.Q0(this.f3098g, ((User) arrayList.get(0)).m1042fp().profileSmall());
            qib0.G.Q0(this.f3100i, ((User) arrayList.get(1)).m1042fp().profileSmall());
            qib0.G.Q0(this.f3102k, ((User) arrayList.get(2)).m1042fp().profileSmall());
            xdl0.M(this.f3097f, true);
            xdl0.M(this.f3099h, true);
            xdl0.M(this.f3101j, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m5471q(this);
        xdl0.M(this.f3095d, false);
    }

    /* JADX INFO: renamed from: q */
    public final void m5471q(View view) {
        fih.m10114a(this, view);
    }

    public FeedNearbyOnlineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedNearbyOnlineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
