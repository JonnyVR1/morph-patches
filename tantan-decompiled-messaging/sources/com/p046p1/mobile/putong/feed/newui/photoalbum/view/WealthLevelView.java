package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p147v.VDraweeView;
import p149l.chp0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class WealthLevelView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public UserWealthGradeConfig f42596o;

    public WealthLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: v */
    private void m65301v() {
        setOnClickListener(new View.OnClickListener() { // from class: l.dhp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86315a.m65302w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m65302w(View view) {
        UserWealthGradeConfig userWealthGradeConfig = this.f42596o;
        if (userWealthGradeConfig == null || TextUtils.isEmpty(userWealthGradeConfig.wealthGradeDesc)) {
            return;
        }
        chp0.m106986e(this, this.f42596o.wealthGradeDesc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65301v();
    }

    /* JADX INFO: renamed from: x */
    public void m65303x(User user) {
        List<SettingGroups> list;
        xdl0.m208344M(this, false);
        Settings settings = user.settings;
        if (settings == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || user.settings.settingGroups.get(0).live == null || user.settings.settingGroups.get(0).live.hideMomentsWealthTag.booleanValue()) {
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigMo67219Gj = FeedModule.m60223M().mo67219Gj((int) user.hierarchy.grade, false);
        this.f42596o = userWealthGradeConfigMo67219Gj;
        if (TextUtils.isEmpty(userWealthGradeConfigMo67219Gj.wealthIconUrl)) {
            return;
        }
        xdl0.m208344M(this, true);
        chp0.m106984c(this.f42596o.wealthIconUrl, this, t100.m186890d(14.0f));
    }

    public WealthLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WealthLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
