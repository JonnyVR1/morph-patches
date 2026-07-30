package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.data.ThirdShareSource;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import java.util.HashMap;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_Expandable;
import p149l.ebh;
import p149l.n8i;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedListTextWithCommentItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListTextWithCommentItem f40855a;

    /* JADX INFO: renamed from: b */
    public VLinear f40856b;

    /* JADX INFO: renamed from: c */
    public TextView f40857c;

    /* JADX INFO: renamed from: d */
    public VText f40858d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f40859e;

    /* JADX INFO: renamed from: f */
    public VText_Expandable f40860f;

    /* JADX INFO: renamed from: g */
    public VText f40861g;

    /* JADX INFO: renamed from: h */
    public Moment f40862h;

    /* JADX INFO: renamed from: i */
    public RawFeed f40863i;

    /* JADX INFO: renamed from: j */
    public String f40864j;

    /* JADX INFO: renamed from: k */
    public HashMap<String, Boolean> f40865k;

    public FeedListTextWithCommentItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m63104c(View view) {
        ebh.m115471a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m63105d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m63106e() {
        xdl0.m208344M(this.f40861g, true);
        this.f40861g.setText("该动态已被用户删除");
    }

    /* JADX INFO: renamed from: f */
    public final void m63107f() {
        this.f40860f.setText(this.f40862h.value);
        this.f40860f.m223283n(this.f40865k, this.f40862h.f56011id);
        this.f40860f.setOnClickListener(new View.OnClickListener() { // from class: l.dbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85316a.m63109h(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m63108g() {
        ThirdShareSource thirdShareSource = this.f40862h.thirdShareSource;
        if (thirdShareSource == null || TextUtils.isEmpty(thirdShareSource.sourceId)) {
            xdl0.m208344M(this.f40861g, false);
            return;
        }
        xdl0.m208344M(this.f40861g, true);
        final Moment momentM209572w7 = FeedModule.f38855d.m209572w7(this.f40862h.thirdShareSource.sourceId);
        if (momentM209572w7 == null || TextUtils.isEmpty(momentM209572w7.owner)) {
            m63106e();
            return;
        }
        User userM209447e8 = FeedModule.f38855d.m209447e8(momentM209572w7.owner);
        if (userM209447e8 == null || TextUtils.isEmpty(momentM209572w7.f56011id) || TextUtils.isEmpty(userM209447e8.name)) {
            m63106e();
            return;
        }
        this.f40861g.setText("@" + userM209447e8.name + momentM209572w7.value);
        this.f40861g.setOnClickListener(new View.OnClickListener() { // from class: l.cbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80141a.m63110i(momentM209572w7, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m63109h(View view) {
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(this.f40864j).m64846m(this.f40862h.f56011id).m64847n(this.f40862h.owner).m64853t(true).m64848o(this.f40862h.momentValue).m64852s(this.f40863i).m64835b();
        if (intentM64835b == null) {
            return;
        }
        m63105d().startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m63110i(Moment moment, View view) {
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64836c(false).m64839f(this.f40864j).m64846m(moment.f56011id).m64843j(false).m64847n(moment.owner).m64840g(-1).m64853t(true).m64841h(false).m64848o(moment.momentValue).m64835b();
        if (intentM64835b == null) {
            return;
        }
        m63105d().startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: j */
    public final void m63111j(int i) {
        xdl0.m208370d0(this.f40856b, 0);
        xdl0.m208344M(this.f40856b, true);
        boolean zEquals = this.f40862h.feedTime.equals(FeedModule.f38852a.getString(R$string.f39076i2));
        VText vText = this.f40858d;
        if (zEquals) {
            xdl0.m208344M(vText, false);
            this.f40857c.setText(this.f40862h.feedTime);
            TextView textView = this.f40857c;
            textView.setTextSize(n8i.m158499f(textView, t100.m186890d(55.0f), this.f40862h.feedTime, 17.0f));
        } else {
            xdl0.m208344M(vText, true);
            String[] strArrSplit = this.f40862h.feedTime.split("/");
            this.f40857c.setText(strArrSplit[0]);
            this.f40858d.setText(strArrSplit[1]);
        }
        TextView textView2 = this.f40857c;
        if (i == 0) {
            xdl0.m208360X(textView2, t100.m186890d(17.0f));
        } else {
            xdl0.m208360X(textView2, 0);
        }
        xdl0.m208360X(this.f40856b, t100.m186890d(-2.0f));
        this.f40858d.setGravity(1);
        this.f40857c.setGravity(1);
        this.f40858d.setIncludeFontPadding(false);
        this.f40857c.setIncludeFontPadding(false);
    }

    /* JADX INFO: renamed from: k */
    public void m63112k(Moment moment, String str, int i, HashMap<String, Boolean> map, String str2) {
        m63113l(moment, str, i, map, str2, null);
    }

    /* JADX INFO: renamed from: l */
    public void m63113l(Moment moment, String str, int i, HashMap<String, Boolean> map, String str2, RawFeed rawFeed) {
        this.f40864j = str;
        this.f40862h = moment;
        this.f40863i = rawFeed;
        this.f40865k = map;
        if (moment == null) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        m63107f();
        m63108g();
        LinearLayout linearLayout = this.f40859e;
        if (i == 0) {
            xdl0.m208360X(linearLayout, t100.m186890d(m63105d() instanceof MomentDetailAct ? 0.0f : 16.0f));
        } else {
            xdl0.m208360X(linearLayout, 0);
        }
        if (TextUtils.isEmpty(moment.feedTime) || (m63105d() instanceof MomentDetailAct)) {
            xdl0.m208344M(this.f40856b, false);
        } else {
            m63111j(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63104c(this);
    }

    public FeedListTextWithCommentItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedListTextWithCommentItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedListTextWithCommentItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
