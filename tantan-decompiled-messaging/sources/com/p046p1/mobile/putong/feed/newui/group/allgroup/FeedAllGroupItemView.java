package com.p046p1.mobile.putong.feed.newui.group.allgroup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Group;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p149l.kmg;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAllGroupItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f39979d;

    /* JADX INFO: renamed from: e */
    public TextView f39980e;

    /* JADX INFO: renamed from: f */
    public TextView f39981f;

    /* JADX INFO: renamed from: g */
    public TextView f39982g;

    /* JADX INFO: renamed from: h */
    public VImage f39983h;

    /* JADX INFO: renamed from: i */
    public VFrame f39984i;

    /* JADX INFO: renamed from: j */
    public VFrame f39985j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f39986k;

    /* JADX INFO: renamed from: l */
    public VFrame f39987l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f39988m;

    /* JADX INFO: renamed from: n */
    public VFrame f39989n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f39990o;

    /* JADX INFO: renamed from: p */
    public TextView f39991p;

    public FeedAllGroupItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61908p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m61908p(View view) {
        kmg.m146531a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final String m61909q(long j) {
        if (j < 10000) {
            return j + "";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(j / 10000.0d) + "w";
    }

    /* JADX INFO: renamed from: z */
    public void m61910z(Group group, int i) {
        if (group == null) {
            return;
        }
        xdl0.m208344M(this.f39981f, group.isGroupAnonymousType());
        if (group.backgroundColors.size() >= 2) {
            try {
                int[] iArr = new int[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    iArr[i2] = Color.parseColor(group.backgroundColors.get(i2));
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, iArr);
                gradientDrawable.setGradientType(0);
                float fM186890d = t100.m186890d(16.0f);
                gradientDrawable.setCornerRadii(new float[]{fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d});
                setBackground(gradientDrawable);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                List<String> list = group.backgroundColors;
                shapeDrawable.getPaint().setColor(Color.parseColor(list.get(list.size() - 1)));
                this.f39985j.setBackground(shapeDrawable);
                this.f39987l.setBackground(shapeDrawable);
                this.f39989n.setBackground(shapeDrawable);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        this.f39980e.setText(group.name);
        qib0.f154691G.m102325I0(this.f39979d, group.headIcon, t100.m186890d(56.0f), t100.m186890d(56.0f));
        TextView textView = this.f39991p;
        if (i != 1) {
            xdl0.m208344M(textView, group.unReadMomentCounter > 0);
            xdl0.m208344M(this.f39984i, false);
            this.f39991p.setText(group.unReadMomentCounter > 99 ? "99+" : group.unReadMomentCounter + "");
            boolean zIsEmpty = TextUtils.isEmpty(group.preViewContent);
            TextView textView2 = this.f39982g;
            if (!zIsEmpty) {
                textView2.setText(group.preViewContent);
                return;
            }
            textView2.setText(m61909q(group.userCounter) + group.state);
            return;
        }
        xdl0.m208344M(textView, false);
        List<String> list2 = group.userIds;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(it.next());
            if (NullChecker.m81303a(userM209447e8)) {
                arrayList.add(userM209447e8);
            }
        }
        int size = arrayList.size();
        VFrame vFrame = this.f39984i;
        if (size >= 3) {
            xdl0.m208344M(vFrame, !group.isGroupAnonymousType());
            qib0.f154691G.m102341Q0(this.f39986k, ((User) arrayList.get(2)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f39988m, ((User) arrayList.get(1)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f39990o, ((User) arrayList.get(0)).m60124fp().profileSmall());
        } else {
            xdl0.m208344M(vFrame, false);
        }
        this.f39982g.setText(m61909q(group.userCounter) + group.state);
    }

    public FeedAllGroupItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedAllGroupItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
