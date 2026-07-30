package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.hello;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.NearbyOnline;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.fih;
import p149l.qib0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedNearbyOnlineView extends VRelative {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f41634d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f41635e;

    /* JADX INFO: renamed from: f */
    public VLinear f41636f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f41637g;

    /* JADX INFO: renamed from: h */
    public VLinear f41638h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f41639i;

    /* JADX INFO: renamed from: j */
    public VLinear f41640j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f41641k;

    /* JADX INFO: renamed from: l */
    public VImage f41642l;

    /* JADX INFO: renamed from: m */
    public VText f41643m;

    public FeedNearbyOnlineView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m64390z(View view) {
        zvf0.m220396r("e_nearby_online", OMSDialogPositon.p_nearby);
        getContext().startActivity(new Intent(getContext(), (Class<?>) FeedHelloNearbyOnlineAct.class));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B */
    public void m64391B(NearbyOnline nearbyOnline) {
        m64392H(nearbyOnline);
        this.f41643m.setText("附近 " + nearbyOnline.userCount + " 人在线");
        xdl0.m208344M(this.f41634d, true);
        xdl0.m208329E0(this.f41634d, new View.OnClickListener() { // from class: l.eih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91604a.m64390z(view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m64392H(NearbyOnline nearbyOnline) {
        xdl0.m208344M(this.f41635e, true);
        if (nearbyOnline == null) {
            return;
        }
        int size = nearbyOnline.userIds.size();
        if (size == 1) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(nearbyOnline.userIds.get(0));
            if (userM209447e8 == null) {
                return;
            }
            qib0.f154691G.m102341Q0(this.f41637g, userM209447e8.m60124fp().profileSmall());
            xdl0.m208344M(this.f41636f, true);
            xdl0.m208344M(this.f41638h, false);
            xdl0.m208344M(this.f41640j, false);
            return;
        }
        List<String> list = nearbyOnline.userIds;
        if (size == 2) {
            User userM209447e9 = FeedModule.f38855d.m209447e8(list.get(0));
            User userM209447e10 = FeedModule.f38855d.m209447e8(nearbyOnline.userIds.get(1));
            if (userM209447e9 == null && userM209447e10 == null) {
                return;
            }
            if (userM209447e9 == null || userM209447e10 == null) {
                qib0.f154691G.m102341Q0(this.f41637g, (userM209447e9 == null ? userM209447e10.m60124fp() : userM209447e9.m60124fp()).profileSmall());
                xdl0.m208344M(this.f41636f, true);
                xdl0.m208344M(this.f41638h, false);
                xdl0.m208344M(this.f41640j, false);
                return;
            }
            qib0.f154691G.m102341Q0(this.f41637g, userM209447e10.m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f41639i, userM209447e9.m60124fp().profileSmall());
            xdl0.m208344M(this.f41636f, true);
            xdl0.m208344M(this.f41638h, true);
            xdl0.m208344M(this.f41640j, false);
            return;
        }
        User userM209447e11 = FeedModule.f38855d.m209447e8(list.get(0));
        User userM209447e12 = FeedModule.f38855d.m209447e8(nearbyOnline.userIds.get(1));
        User userM209447e13 = FeedModule.f38855d.m209447e8(nearbyOnline.userIds.get(2));
        if (userM209447e11 == null && userM209447e12 == null && userM209447e13 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(userM209447e11)) {
            arrayList.add(userM209447e11);
        }
        if (NullChecker.m81303a(userM209447e12)) {
            arrayList.add(userM209447e12);
        }
        if (NullChecker.m81303a(userM209447e13)) {
            arrayList.add(userM209447e13);
        }
        if (arrayList.size() == 1) {
            qib0.f154691G.m102341Q0(this.f41637g, ((User) arrayList.get(0)).m60124fp().profileSmall());
            xdl0.m208344M(this.f41636f, true);
            xdl0.m208344M(this.f41638h, false);
            xdl0.m208344M(this.f41640j, false);
        }
        if (arrayList.size() == 2) {
            qib0.f154691G.m102341Q0(this.f41637g, ((User) arrayList.get(0)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f41639i, ((User) arrayList.get(1)).m60124fp().profileSmall());
            xdl0.m208344M(this.f41636f, true);
            xdl0.m208344M(this.f41638h, true);
            xdl0.m208344M(this.f41640j, false);
        }
        if (arrayList.size() == 3) {
            qib0.f154691G.m102341Q0(this.f41637g, ((User) arrayList.get(0)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f41639i, ((User) arrayList.get(1)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f41641k, ((User) arrayList.get(2)).m60124fp().profileSmall());
            xdl0.m208344M(this.f41636f, true);
            xdl0.m208344M(this.f41638h, true);
            xdl0.m208344M(this.f41640j, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m64393q(this);
        xdl0.m208344M(this.f41634d, false);
    }

    /* JADX INFO: renamed from: q */
    public final void m64393q(View view) {
        fih.m121512a(this, view);
    }

    public FeedNearbyOnlineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedNearbyOnlineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
