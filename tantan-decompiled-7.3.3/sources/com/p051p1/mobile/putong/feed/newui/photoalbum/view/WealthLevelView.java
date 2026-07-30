package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gqp0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class WealthLevelView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public UserWealthGradeConfig f43444o;

    public WealthLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: v */
    private void m66484v() {
        setOnClickListener(new View.OnClickListener() { // from class: l.hqp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111163a.m66485w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m66485w(View view) {
        UserWealthGradeConfig userWealthGradeConfig = this.f43444o;
        if (userWealthGradeConfig == null || TextUtils.isEmpty(userWealthGradeConfig.wealthGradeDesc)) {
            return;
        }
        gqp0.m131418e(this, this.f43444o.wealthGradeDesc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66484v();
    }

    /* JADX INFO: renamed from: x */
    public void m66486x(User user) {
        List<SettingGroups> list;
        bnl0.m105524M(this, false);
        Settings settings = user.settings;
        if (settings == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || user.settings.settingGroups.get(0).live == null || user.settings.settingGroups.get(0).live.hideMomentsWealthTag.booleanValue()) {
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigMo68402Gj = FeedModule.m61407M().mo68402Gj((int) user.hierarchy.grade, false);
        this.f43444o = userWealthGradeConfigMo68402Gj;
        if (TextUtils.isEmpty(userWealthGradeConfigMo68402Gj.wealthIconUrl)) {
            return;
        }
        bnl0.m105524M(this, true);
        gqp0.m131416c(this.f43444o.wealthIconUrl, this, qa00.m175859d(14.0f));
    }

    public WealthLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WealthLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
