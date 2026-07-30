package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;
import p153l.kze;
import p153l.msi0;

/* JADX INFO: loaded from: classes.dex */
public class EmojiButton extends Button {

    /* JADX INFO: renamed from: a */
    public kze f1819a;

    /* JADX INFO: renamed from: b */
    public boolean f1820b;

    public EmojiButton(Context context) {
        super(context);
        m2450a();
    }

    private kze getEmojiTextViewHelper() {
        if (this.f1819a == null) {
            this.f1819a = new kze(this);
        }
        return this.f1819a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2450a() {
        if (this.f1820b) {
            return;
        }
        this.f1820b = true;
        getEmojiTextViewHelper().m152168c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m152167b(z);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(msi0.m159819q(this, callback));
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m152166a(inputFilterArr));
    }

    public EmojiButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2450a();
    }

    public EmojiButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2450a();
    }
}
