package p149l;

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
public final class mji0 {

    /* JADX INFO: renamed from: l.mji0$a */
    @RequiresApi(23)
    public static class C18465a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m154824a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m154825b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m154826c(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m154827d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m154828e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static void m154829f(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: renamed from: l.mji0$b */
    @RequiresApi(24)
    public static class C18466b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static DecimalFormatSymbols m154830a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: l.mji0$c */
    @RequiresApi(28)
    public static class C18467c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m154831a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static String[] m154832b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static PrecomputedText.Params m154833c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m154834d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: l.mji0$d */
    @RequiresApi(26)
    public static class ActionModeCallbackC18468d implements ActionMode.Callback {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f134137a;

        /* JADX INFO: renamed from: b */
        public final TextView f134138b;

        /* JADX INFO: renamed from: c */
        public Class<?> f134139c;

        /* JADX INFO: renamed from: d */
        public Method f134140d;

        /* JADX INFO: renamed from: e */
        public boolean f134141e;

        /* JADX INFO: renamed from: f */
        public boolean f134142f = false;

        public ActionModeCallbackC18468d(ActionMode.Callback callback, TextView textView) {
            this.f134137a = callback;
            this.f134138b = textView;
        }

        /* JADX INFO: renamed from: a */
        public final Intent m154835a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.TEXT_PLAIN);
        }

        /* JADX INFO: renamed from: b */
        public final Intent m154836b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m154835a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m154838d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* JADX INFO: renamed from: c */
        public final List<ResolveInfo> m154837c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m154835a(), 0)) {
                    if (m154839e(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m154838d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m154839e(ResolveInfo resolveInfo, Context context) {
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
        public final void m154840f(Menu menu) {
            Context context = this.f134138b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z = this.f134142f;
            Class cls = Integer.TYPE;
            if (!z) {
                this.f134142f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f134139c = cls2;
                    this.f134140d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f134141e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f134139c = null;
                    this.f134140d = null;
                    this.f134141e = false;
                }
            }
            try {
                Method declaredMethod = (this.f134141e && this.f134139c.isInstance(menu)) ? this.f134140d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listM154837c = m154837c(context, packageManager);
                for (int i = 0; i < listM154837c.size(); i++) {
                    ResolveInfo resolveInfo = listM154837c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m154836b(resolveInfo, this.f134138b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f134137a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f134137a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f134137a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m154840f(menu);
            return this.f134137a.onPrepareActionMode(actionMode, menu);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Drawable[] m154807a(@NonNull TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: b */
    public static int m154808b(@NonNull TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* JADX INFO: renamed from: c */
    public static int m154809c(@NonNull TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: renamed from: d */
    public static int m154810d(@NonNull TextView textView) {
        return textView.getMaxLines();
    }

    /* JADX INFO: renamed from: e */
    public static int m154811e(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
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
    public static TextDirectionHeuristic m154812f(@NonNull TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C18467c.m154832b(C18466b.m154830a(textView.getTextLocale()))[0].codePointAt(0));
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
    public static nf80.C18685a m154813g(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new nf80.C18685a(C18467c.m154833c(textView));
        }
        nf80.C18685a.a aVar = new nf80.C18685a.a(new TextPaint(textView.getPaint()));
        aVar.m159146b(C18465a.m154824a(textView));
        aVar.m159147c(C18465a.m154825b(textView));
        aVar.m159148d(m154812f(textView));
        return aVar.m159145a();
    }

    /* JADX INFO: renamed from: h */
    public static void m154814h(@NonNull TextView textView, @Nullable ColorStateList colorStateList) {
        tf80.m188658e(textView);
        C18465a.m154827d(textView, colorStateList);
    }

    /* JADX INFO: renamed from: i */
    public static void m154815i(@NonNull TextView textView, @Nullable PorterDuff.Mode mode) {
        tf80.m188658e(textView);
        C18465a.m154828e(textView, mode);
    }

    /* JADX INFO: renamed from: j */
    public static void m154816j(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: k */
    public static void m154817k(@NonNull TextView textView, @IntRange(from = 0) @Px int i) {
        tf80.m188656c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C18467c.m154834d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m154818l(@NonNull TextView textView, @IntRange(from = 0) @Px int i) {
        tf80.m188656c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m154819m(@NonNull TextView textView, @IntRange(from = 0) @Px int i) {
        tf80.m188656c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m154820n(@NonNull TextView textView, @NonNull nf80 nf80Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(C18467c.m154831a(nf80Var.m159139b()));
        } else if (m154813g(textView).m159140a(nf80Var.m159138a())) {
            textView.setText(nf80Var);
        } else {
            ig3.m135964a("Given text can not be applied to TextView.");
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m154821o(@NonNull TextView textView, @StyleRes int i) {
        textView.setTextAppearance(i);
    }

    /* JADX INFO: renamed from: p */
    public static void m154822p(@NonNull TextView textView, @NonNull nf80.C18685a c18685a) {
        textView.setTextDirection(m154811e(c18685a.m159143d()));
        textView.getPaint().set(c18685a.m159144e());
        C18465a.m154826c(textView, c18685a.m159141b());
        C18465a.m154829f(textView, c18685a.m159142c());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public static ActionMode.Callback m154823q(@NonNull TextView textView, @Nullable ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC18468d) || callback == null) ? callback : new ActionModeCallbackC18468d(callback, textView);
    }
}
