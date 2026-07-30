package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import p149l.hu0;
import p149l.n0c0;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC0074a extends hu0 implements DialogInterface {

    /* JADX INFO: renamed from: a */
    public final AlertController f314a;

    public DialogInterfaceC0074a(@NonNull Context context, @StyleRes int i) {
        super(context, m356r(context, i));
        this.f314a = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: r */
    public static int m356r(@NonNull Context context, @StyleRes int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n0c0.f136524p, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f314a.m234e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f314a.m235f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f314a.m236g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: renamed from: q */
    public ListView m357q() {
        return this.f314a.m233d();
    }

    /* JADX INFO: renamed from: s */
    public void m358s(View view) {
        this.f314a.m247r(view);
    }

    @Override // p149l.hu0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f314a.m245p(charSequence);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a */
    public static class a {

        /* JADX INFO: renamed from: P */
        private final AlertController.C0056b f315P;
        private final int mTheme;

        public a(@NonNull Context context, @StyleRes int i) {
            this.f315P = new AlertController.C0056b(new ContextThemeWrapper(context, DialogInterfaceC0074a.m356r(context, i)));
            this.mTheme = i;
        }

        @NonNull
        public DialogInterfaceC0074a create() {
            DialogInterfaceC0074a dialogInterfaceC0074a = new DialogInterfaceC0074a(this.f315P.f178a, this.mTheme);
            this.f315P.m255a(dialogInterfaceC0074a.f314a);
            dialogInterfaceC0074a.setCancelable(this.f315P.f195r);
            if (this.f315P.f195r) {
                dialogInterfaceC0074a.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0074a.setOnCancelListener(this.f315P.f196s);
            dialogInterfaceC0074a.setOnDismissListener(this.f315P.f197t);
            DialogInterface.OnKeyListener onKeyListener = this.f315P.f198u;
            if (onKeyListener != null) {
                dialogInterfaceC0074a.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0074a;
        }

        @NonNull
        public Context getContext() {
            return this.f315P.f178a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f200w = listAdapter;
            c0056b.f201x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z) {
            this.f315P.f195r = z;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f172K = cursor;
            c0056b.f173L = str;
            c0056b.f201x = onClickListener;
            return this;
        }

        public a setCustomTitle(@Nullable View view) {
            this.f315P.f184g = view;
            return this;
        }

        public a setIcon(@DrawableRes int i) {
            this.f315P.f180c = i;
            return this;
        }

        public a setIconAttribute(@AttrRes int i) {
            TypedValue typedValue = new TypedValue();
            this.f315P.f178a.getTheme().resolveAttribute(i, typedValue, true);
            this.f315P.f180c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z) {
            this.f315P.f175N = z;
            return this;
        }

        public a setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f199v = c0056b.f178a.getResources().getTextArray(i);
            this.f315P.f201x = onClickListener;
            return this;
        }

        public a setMessage(@StringRes int i) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f185h = c0056b.f178a.getText(i);
            return this;
        }

        public a setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f199v = c0056b.f178a.getResources().getTextArray(i);
            AlertController.C0056b c0056b2 = this.f315P;
            c0056b2.f171J = onMultiChoiceClickListener;
            c0056b2.f167F = zArr;
            c0056b2.f168G = true;
            return this;
        }

        public a setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f189l = c0056b.f178a.getText(i);
            this.f315P.f191n = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.f315P.f190m = drawable;
            return this;
        }

        public a setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f192o = c0056b.f178a.getText(i);
            this.f315P.f194q = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.f315P.f193p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f315P.f196s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f315P.f197t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f315P.f176O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f315P.f198u = onKeyListener;
            return this;
        }

        public a setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f186i = c0056b.f178a.getText(i);
            this.f315P.f188k = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.f315P.f187j = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a setRecycleOnMeasureEnabled(boolean z) {
            this.f315P.f177P = z;
            return this;
        }

        public a setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f199v = c0056b.f178a.getResources().getTextArray(i);
            AlertController.C0056b c0056b2 = this.f315P;
            c0056b2.f201x = onClickListener;
            c0056b2.f170I = i2;
            c0056b2.f169H = true;
            return this;
        }

        public a setTitle(@StringRes int i) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f183f = c0056b.f178a.getText(i);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a setView(View view, int i, int i2, int i3, int i4) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f203z = view;
            c0056b.f202y = 0;
            c0056b.f166E = true;
            c0056b.f162A = i;
            c0056b.f163B = i2;
            c0056b.f164C = i3;
            c0056b.f165D = i4;
            return this;
        }

        public DialogInterfaceC0074a show() {
            DialogInterfaceC0074a dialogInterfaceC0074aCreate = create();
            dialogInterfaceC0074aCreate.show();
            return dialogInterfaceC0074aCreate;
        }

        public a setIcon(@Nullable Drawable drawable) {
            this.f315P.f181d = drawable;
            return this;
        }

        public a setMessage(@Nullable CharSequence charSequence) {
            this.f315P.f185h = charSequence;
            return this;
        }

        public a setTitle(@Nullable CharSequence charSequence) {
            this.f315P.f183f = charSequence;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f189l = charSequence;
            c0056b.f191n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f192o = charSequence;
            c0056b.f194q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f186i = charSequence;
            c0056b.f188k = onClickListener;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f199v = charSequenceArr;
            c0056b.f201x = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f203z = view;
            c0056b.f202y = 0;
            c0056b.f166E = false;
            return this;
        }

        public a(@NonNull Context context) {
            this(context, DialogInterfaceC0074a.m356r(context, 0));
        }

        public a setView(int i) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f203z = null;
            c0056b.f202y = i;
            c0056b.f166E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f199v = charSequenceArr;
            c0056b.f171J = onMultiChoiceClickListener;
            c0056b.f167F = zArr;
            c0056b.f168G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f172K = cursor;
            c0056b.f201x = onClickListener;
            c0056b.f170I = i;
            c0056b.f173L = str;
            c0056b.f169H = true;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f172K = cursor;
            c0056b.f171J = onMultiChoiceClickListener;
            c0056b.f174M = str;
            c0056b.f173L = str2;
            c0056b.f168G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f199v = charSequenceArr;
            c0056b.f201x = onClickListener;
            c0056b.f170I = i;
            c0056b.f169H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056b c0056b = this.f315P;
            c0056b.f200w = listAdapter;
            c0056b.f201x = onClickListener;
            c0056b.f170I = i;
            c0056b.f169H = true;
            return this;
        }
    }
}
