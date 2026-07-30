package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public final class msi0 {

    /* JADX INFO: renamed from: l.msi0$a */
    @RequiresApi(23)
    public static class C18696a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m159820a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m159821b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m159822c(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m159823d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m159824e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static void m159825f(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: renamed from: l.msi0$b */
    @RequiresApi(24)
    public static class C18697b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static DecimalFormatSymbols m159826a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: l.msi0$c */
    @RequiresApi(28)
    public static class C18698c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m159827a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static String[] m159828b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static PrecomputedText.Params m159829c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m159830d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: l.msi0$d */
    @RequiresApi(26)
    public static class ActionModeCallbackC18699d implements ActionMode.Callback {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f138488a;

        /* JADX INFO: renamed from: b */
        public final TextView f138489b;

        /* JADX INFO: renamed from: c */
        public Class<?> f138490c;

        /* JADX INFO: renamed from: d */
        public Method f138491d;

        /* JADX INFO: renamed from: e */
        public boolean f138492e;

        /* JADX INFO: renamed from: f */
        public boolean f138493f = false;

        public ActionModeCallbackC18699d(ActionMode.Callback callback, TextView textView) {
            this.f138488a = callback;
            this.f138489b = textView;
        }

        /* JADX INFO: renamed from: a */
        public final Intent m159831a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.TEXT_PLAIN);
        }

        /* JADX INFO: renamed from: b */
        public final Intent m159832b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m159831a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m159834d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* JADX INFO: renamed from: c */
        public final List<ResolveInfo> m159833c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m159831a(), 0)) {
                    if (m159835e(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m159834d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m159835e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final void m159836f(Menu menu) {
            Context context = this.f138489b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z = this.f138493f;
            Class cls = Integer.TYPE;
            if (!z) {
                this.f138493f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f138490c = cls2;
                    this.f138491d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f138492e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f138490c = null;
                    this.f138491d = null;
                    this.f138492e = false;
                }
            }
            try {
                Method declaredMethod = (this.f138492e && this.f138490c.isInstance(menu)) ? this.f138491d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listM159833c = m159833c(context, packageManager);
                for (int i = 0; i < listM159833c.size(); i++) {
                    ResolveInfo resolveInfo = listM159833c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m159832b(resolveInfo, this.f138489b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f138488a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f138488a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f138488a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m159836f(menu);
            return this.f138488a.onPrepareActionMode(actionMode, menu);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Drawable[] m159803a(@NonNull TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: b */
    public static int m159804b(@NonNull TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* JADX INFO: renamed from: c */
    public static int m159805c(@NonNull TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: renamed from: d */
    public static int m159806d(@NonNull TextView textView) {
        return textView.getMaxLines();
    }

    /* JADX INFO: renamed from: e */
    public static int m159807e(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    /* JADX INFO: renamed from: f */
    public static TextDirectionHeuristic m159808f(@NonNull TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C18698c.m159828b(C18697b.m159826a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static sn80.C20112a m159809g(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new sn80.C20112a(C18698c.m159829c(textView));
        }
        sn80.C20112a.a aVar = new sn80.C20112a.a(new TextPaint(textView.getPaint()));
        aVar.m186882b(C18696a.m159820a(textView));
        aVar.m186883c(C18696a.m159821b(textView));
        aVar.m186884d(m159808f(textView));
        return aVar.m186881a();
    }

    /* JADX INFO: renamed from: h */
    public static void m159810h(@NonNull TextView textView, @Nullable ColorStateList colorStateList) {
        yn80.m216775e(textView);
        C18696a.m159823d(textView, colorStateList);
    }

    /* JADX INFO: renamed from: i */
    public static void m159811i(@NonNull TextView textView, @Nullable PorterDuff.Mode mode) {
        yn80.m216775e(textView);
        C18696a.m159824e(textView, mode);
    }

    /* JADX INFO: renamed from: j */
    public static void m159812j(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: k */
    public static void m159813k(@NonNull TextView textView, @IntRange(from = 0) @Px int i) {
        yn80.m216773c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C18698c.m159830d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m159814l(@NonNull TextView textView, @IntRange(from = 0) @Px int i) {
        yn80.m216773c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m159815m(@NonNull TextView textView, @IntRange(from = 0) @Px int i) {
        yn80.m216773c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m159816n(@NonNull TextView textView, @NonNull sn80 sn80Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(C18698c.m159827a(sn80Var.m186875b()));
        } else if (m159809g(textView).m186876a(sn80Var.m186874a())) {
            textView.setText(sn80Var);
        } else {
            wg3.m206174a("Given text can not be applied to TextView.");
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m159817o(@NonNull TextView textView, @StyleRes int i) {
        textView.setTextAppearance(i);
    }

    /* JADX INFO: renamed from: p */
    public static void m159818p(@NonNull TextView textView, @NonNull sn80.C20112a c20112a) {
        textView.setTextDirection(m159807e(c20112a.m186879d()));
        textView.getPaint().set(c20112a.m186880e());
        C18696a.m159822c(textView, c20112a.m186877b());
        C18696a.m159825f(textView, c20112a.m186878c());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public static ActionMode.Callback m159819q(@NonNull TextView textView, @Nullable ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC18699d) || callback == null) ? callback : new ActionModeCallbackC18699d(callback, textView);
    }
}
