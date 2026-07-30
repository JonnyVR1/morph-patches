package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.data.SettingGroups;
import com.p000p1.mobile.putong.data.Settings;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.UserWealthGradeConfig;
import com.p000p1.mobile.putong.feed.FeedModule;
import java.util.List;
import l.t100;
import l.xdl0;
import p007l.chp0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class WealthLevelView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public UserWealthGradeConfig f4057o;

    public WealthLevelView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private void m6402v() {
        setOnClickListener(new View.OnClickListener() { // from class: l.dhp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6943a.m6403w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m6403w(View view) {
        UserWealthGradeConfig userWealthGradeConfig = this.f4057o;
        if (userWealthGradeConfig == null || TextUtils.isEmpty(userWealthGradeConfig.wealthGradeDesc)) {
            return;
        }
        chp0.m9180e(this, this.f4057o.wealthGradeDesc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6402v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public void m6404x(User user) {
        List<SettingGroups> list;
        xdl0.M(this, false);
        Settings settings = user.settings;
        if (settings == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || user.settings.settingGroups.get(0).live == null || user.settings.settingGroups.get(0).live.hideMomentsWealthTag.booleanValue()) {
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigGj = FeedModule.m1141M().Gj((int) user.hierarchy.grade, false);
        this.f4057o = userWealthGradeConfigGj;
        if (TextUtils.isEmpty(userWealthGradeConfigGj.wealthIconUrl)) {
            return;
        }
        xdl0.M(this, true);
        chp0.m9178c(this.f4057o.wealthIconUrl, this, t100.d(14.0f));
    }

    public WealthLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WealthLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
