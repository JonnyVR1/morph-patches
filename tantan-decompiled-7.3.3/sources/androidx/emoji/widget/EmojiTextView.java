package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import p153l.kze;
import p153l.msi0;

/* JADX INFO: loaded from: classes.dex */
public class EmojiTextView extends TextView {

    /* JADX INFO: renamed from: a */
    public kze f1829a;

    /* JADX INFO: renamed from: b */
    public boolean f1830b;

    public EmojiTextView(Context context) {
        super(context);
        m2454a();
    }

    private kze getEmojiTextViewHelper() {
        if (this.f1829a == null) {
            this.f1829a = new kze(this);
        }
        return this.f1829a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2454a() {
        if (this.f1830b) {
            return;
        }
        this.f1830b = true;
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

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2454a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2454a();
    }
}
