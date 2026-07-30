package com.p051p1.mobile.putong.feed.newui.group.allgroup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Group;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p153l.bnl0;
import p153l.qa00;
import p153l.uqb0;
import p153l.zng;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAllGroupItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f40827d;

    /* JADX INFO: renamed from: e */
    public TextView f40828e;

    /* JADX INFO: renamed from: f */
    public TextView f40829f;

    /* JADX INFO: renamed from: g */
    public TextView f40830g;

    /* JADX INFO: renamed from: h */
    public VImage f40831h;

    /* JADX INFO: renamed from: i */
    public VFrame f40832i;

    /* JADX INFO: renamed from: j */
    public VFrame f40833j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f40834k;

    /* JADX INFO: renamed from: l */
    public VFrame f40835l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f40836m;

    /* JADX INFO: renamed from: n */
    public VFrame f40837n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f40838o;

    /* JADX INFO: renamed from: p */
    public TextView f40839p;

    public FeedAllGroupItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63091p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m63091p(View view) {
        zng.m220597a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final String m63092q(long j) {
        if (j < 10000) {
            return j + "";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(j / 10000.0d) + "w";
    }

    /* JADX INFO: renamed from: z */
    public void m63093z(Group group, int i) {
        if (group == null) {
            return;
        }
        bnl0.m105524M(this.f40829f, group.isGroupAnonymousType());
        if (group.backgroundColors.size() >= 2) {
            try {
                int[] iArr = new int[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    iArr[i2] = Color.parseColor(group.backgroundColors.get(i2));
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, iArr);
                gradientDrawable.setGradientType(0);
                float fM175859d = qa00.m175859d(16.0f);
                gradientDrawable.setCornerRadii(new float[]{fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d});
                setBackground(gradientDrawable);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                List<String> list = group.backgroundColors;
                shapeDrawable.getPaint().setColor(Color.parseColor(list.get(list.size() - 1)));
                this.f40833j.setBackground(shapeDrawable);
                this.f40835l.setBackground(shapeDrawable);
                this.f40837n.setBackground(shapeDrawable);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        this.f40828e.setText(group.name);
        uqb0.f180374G.m127109I0(this.f40827d, group.headIcon, qa00.m175859d(56.0f), qa00.m175859d(56.0f));
        TextView textView = this.f40839p;
        if (i != 1) {
            bnl0.m105524M(textView, group.unReadMomentCounter > 0);
            bnl0.m105524M(this.f40832i, false);
            this.f40839p.setText(group.unReadMomentCounter > 99 ? "99+" : group.unReadMomentCounter + "");
            boolean zIsEmpty = TextUtils.isEmpty(group.preViewContent);
            TextView textView2 = this.f40830g;
            if (!zIsEmpty) {
                textView2.setText(group.preViewContent);
                return;
            }
            textView2.setText(m63092q(group.userCounter) + group.state);
            return;
        }
        bnl0.m105524M(textView, false);
        List<String> list2 = group.userIds;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(it.next());
            if (NullChecker.m82486a(userM145688e8)) {
                arrayList.add(userM145688e8);
            }
        }
        int size = arrayList.size();
        VFrame vFrame = this.f40832i;
        if (size >= 3) {
            bnl0.m105524M(vFrame, !group.isGroupAnonymousType());
            uqb0.f180374G.m127125Q0(this.f40834k, ((User) arrayList.get(2)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f40836m, ((User) arrayList.get(1)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f40838o, ((User) arrayList.get(0)).m61308fp().profileSmall());
        } else {
            bnl0.m105524M(vFrame, false);
        }
        this.f40830g.setText(m63092q(group.userCounter) + group.state);
    }

    public FeedAllGroupItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedAllGroupItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
