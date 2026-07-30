package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.r3q;
import p149l.ura;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFriendActiveRemindFemale extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f30971a;

    /* JADX INFO: renamed from: b */
    public VText f30972b;

    public ItemFriendActiveRemindFemale(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48173a(View view) {
        r3q.m177686a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m48174b(Message message, User user) {
        this.f30971a.getPaint().setFakeBoldText(true);
        if (NullChecker.m81303a(user)) {
            this.f30971a.setText((user.isFemale() ? "她" : "他").concat("在等你回复"));
        }
        if (NullChecker.m81303a(message) && NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.femaleUnreplyReminder) && !TextUtils.isEmpty(message.additionalData.femaleUnreplyReminder.remindInfo)) {
            this.f30972b.setText(message.additionalData.femaleUnreplyReminder.remindInfo);
        } else {
            this.f30972b.setText("");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48173a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30971a.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(c3c0.f78683Y6), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f30971a.setTextColor(getResources().getColor(a1c0.f67156j));
            this.f30972b.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemFriendActiveRemindFemale(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFriendActiveRemindFemale(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
