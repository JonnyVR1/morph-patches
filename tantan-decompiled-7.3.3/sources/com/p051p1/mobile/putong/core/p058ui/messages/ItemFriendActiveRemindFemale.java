package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.r5q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFriendActiveRemindFemale extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f31819a;

    /* JADX INFO: renamed from: b */
    public VText f31820b;

    public ItemFriendActiveRemindFemale(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49356a(View view) {
        r5q.m179885a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m49357b(Message message, User user) {
        this.f31819a.getPaint().setFakeBoldText(true);
        if (NullChecker.m82486a(user)) {
            this.f31819a.setText((user.isFemale() ? "她" : "他").concat("在等你回复"));
        }
        if (NullChecker.m82486a(message) && NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.femaleUnreplyReminder) && !TextUtils.isEmpty(message.additionalData.femaleUnreplyReminder.remindInfo)) {
            this.f31820b.setText(message.additionalData.femaleUnreplyReminder.remindInfo);
        } else {
            this.f31820b.setText("");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49356a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31819a.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(ibc0.f113958Y6), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f31819a.setTextColor(getResources().getColor(g9c0.f102820j));
            this.f31820b.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemFriendActiveRemindFemale(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFriendActiveRemindFemale(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
