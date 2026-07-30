package com.p000p1.mobile.putong.feed.newui.group.allgroup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.kmg;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAllGroupItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f1440d;

    /* JADX INFO: renamed from: e */
    public TextView f1441e;

    /* JADX INFO: renamed from: f */
    public TextView f1442f;

    /* JADX INFO: renamed from: g */
    public TextView f1443g;

    /* JADX INFO: renamed from: h */
    public VImage f1444h;

    /* JADX INFO: renamed from: i */
    public VFrame f1445i;

    /* JADX INFO: renamed from: j */
    public VFrame f1446j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f1447k;

    /* JADX INFO: renamed from: l */
    public VFrame f1448l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f1449m;

    /* JADX INFO: renamed from: n */
    public VFrame f1450n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f1451o;

    /* JADX INFO: renamed from: p */
    public TextView f1452p;

    public FeedAllGroupItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2882p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2882p(View view) {
        kmg.m11503a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final String m2883q(long j) {
        if (j < 10000) {
            return j + "";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(j / 10000.0d) + RXScreenCaptureService.KEY_WIDTH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m2884z(Group group, int i) {
        if (group == null) {
            return;
        }
        xdl0.M(this.f1442f, group.isGroupAnonymousType());
        if (group.backgroundColors.size() >= 2) {
            try {
                int[] iArr = new int[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    iArr[i2] = Color.parseColor(group.backgroundColors.get(i2));
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, iArr);
                gradientDrawable.setGradientType(0);
                float fD = t100.d(16.0f);
                gradientDrawable.setCornerRadii(new float[]{fD, fD, fD, fD, fD, fD, fD, fD});
                setBackground(gradientDrawable);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                List<String> list = group.backgroundColors;
                shapeDrawable.getPaint().setColor(Color.parseColor(list.get(list.size() - 1)));
                this.f1446j.setBackground(shapeDrawable);
                this.f1448l.setBackground(shapeDrawable);
                this.f1450n.setBackground(shapeDrawable);
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        this.f1441e.setText(group.name);
        qib0.G.I0(this.f1440d, group.headIcon, t100.d(56.0f), t100.d(56.0f));
        TextView textView = this.f1452p;
        if (i != 1) {
            xdl0.M(textView, group.unReadMomentCounter > 0);
            xdl0.M(this.f1445i, false);
            this.f1452p.setText(group.unReadMomentCounter > 99 ? "99+" : group.unReadMomentCounter + "");
            boolean zIsEmpty = TextUtils.isEmpty(group.preViewContent);
            TextView textView2 = this.f1443g;
            if (!zIsEmpty) {
                textView2.setText(group.preViewContent);
                return;
            }
            textView2.setText(m2883q(group.userCounter) + group.state);
            return;
        }
        xdl0.M(textView, false);
        List<String> list2 = group.userIds;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            User userM16628e8 = FeedModule.f316d.m16628e8(it.next());
            if (NullChecker.a(userM16628e8)) {
                arrayList.add(userM16628e8);
            }
        }
        int size = arrayList.size();
        VFrame vFrame = this.f1445i;
        if (size >= 3) {
            xdl0.M(vFrame, !group.isGroupAnonymousType());
            qib0.G.Q0(this.f1447k, ((User) arrayList.get(2)).m1042fp().profileSmall());
            qib0.G.Q0(this.f1449m, ((User) arrayList.get(1)).m1042fp().profileSmall());
            qib0.G.Q0(this.f1451o, ((User) arrayList.get(0)).m1042fp().profileSmall());
        } else {
            xdl0.M(vFrame, false);
        }
        this.f1443g.setText(m2883q(group.userCounter) + group.state);
    }

    public FeedAllGroupItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedAllGroupItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
