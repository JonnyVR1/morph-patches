package p149l;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class fvg0 extends uvc0 implements View.OnClickListener {

    /* JADX INFO: renamed from: l */
    public final SearchManager f99425l;

    /* JADX INFO: renamed from: m */
    public final SearchView f99426m;

    /* JADX INFO: renamed from: n */
    public final SearchableInfo f99427n;

    /* JADX INFO: renamed from: o */
    public final Context f99428o;

    /* JADX INFO: renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f99429p;

    /* JADX INFO: renamed from: q */
    public final int f99430q;

    /* JADX INFO: renamed from: r */
    public boolean f99431r;

    /* JADX INFO: renamed from: s */
    public int f99432s;

    /* JADX INFO: renamed from: t */
    public ColorStateList f99433t;

    /* JADX INFO: renamed from: u */
    public int f99434u;

    /* JADX INFO: renamed from: v */
    public int f99435v;

    /* JADX INFO: renamed from: w */
    public int f99436w;

    /* JADX INFO: renamed from: x */
    public int f99437x;

    /* JADX INFO: renamed from: y */
    public int f99438y;

    /* JADX INFO: renamed from: z */
    public int f99439z;

    /* JADX INFO: renamed from: l.fvg0$a */
    public static final class C16928a {

        /* JADX INFO: renamed from: a */
        public final TextView f99440a;

        /* JADX INFO: renamed from: b */
        public final TextView f99441b;

        /* JADX INFO: renamed from: c */
        public final ImageView f99442c;

        /* JADX INFO: renamed from: d */
        public final ImageView f99443d;

        /* JADX INFO: renamed from: e */
        public final ImageView f99444e;

        public C16928a(View view) {
            this.f99440a = (TextView) view.findViewById(R.id.text1);
            this.f99441b = (TextView) view.findViewById(R.id.text2);
            this.f99442c = (ImageView) view.findViewById(R.id.icon1);
            this.f99443d = (ImageView) view.findViewById(R.id.icon2);
            this.f99444e = (ImageView) view.findViewById(s5c0.f162535s);
        }
    }

    public fvg0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f99431r = false;
        this.f99432s = 1;
        this.f99434u = -1;
        this.f99435v = -1;
        this.f99436w = -1;
        this.f99437x = -1;
        this.f99438y = -1;
        this.f99439z = -1;
        this.f99425l = (SearchManager) this.f104855d.getSystemService(FirebaseAnalytics.Event.SEARCH);
        this.f99426m = searchView;
        this.f99427n = searchableInfo;
        this.f99430q = searchView.getSuggestionCommitIconResId();
        this.f99428o = context;
        this.f99429p = weakHashMap;
    }

    /* JADX INFO: renamed from: n */
    public static String m123278n(Cursor cursor, String str) {
        return m123279v(cursor, cursor.getColumnIndex(str));
    }

    /* JADX INFO: renamed from: v */
    public static String m123279v(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m123280A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p149l.gxb, p149l.hxb.InterfaceC17425a
    /* JADX INFO: renamed from: a */
    public void mo123281a(Cursor cursor) {
        if (this.f99431r) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo123281a(cursor);
            if (cursor != null) {
                this.f99434u = cursor.getColumnIndex("suggest_text_1");
                this.f99435v = cursor.getColumnIndex("suggest_text_2");
                this.f99436w = cursor.getColumnIndex("suggest_text_2_url");
                this.f99437x = cursor.getColumnIndex("suggest_icon_1");
                this.f99438y = cursor.getColumnIndex("suggest_icon_2");
                this.f99439z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p149l.hxb.InterfaceC17425a
    /* JADX INFO: renamed from: c */
    public Cursor mo123282c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f99426m.getVisibility() == 0 && this.f99426m.getWindowVisibility() == 0) {
            try {
                Cursor cursorM123295u = m123295u(this.f99427n, string, 50);
                if (cursorM123295u != null) {
                    cursorM123295u.getCount();
                    return cursorM123295u;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // p149l.gxb, p149l.hxb.InterfaceC17425a
    public CharSequence convertToString(Cursor cursor) {
        String strM123278n;
        String strM123278n2;
        if (cursor == null) {
            return null;
        }
        String strM123278n3 = m123278n(cursor, "suggest_intent_query");
        if (strM123278n3 != null) {
            return strM123278n3;
        }
        if (this.f99427n.shouldRewriteQueryFromData() && (strM123278n2 = m123278n(cursor, "suggest_intent_data")) != null) {
            return strM123278n2;
        }
        if (!this.f99427n.shouldRewriteQueryFromText() || (strM123278n = m123278n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM123278n;
    }

    @Override // p149l.gxb
    /* JADX INFO: renamed from: d */
    public void mo123283d(View view, Context context, Cursor cursor) {
        C16928a c16928a = (C16928a) view.getTag();
        int i = this.f99439z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c16928a.f99440a != null) {
            m123298y(c16928a.f99440a, m123279v(cursor, this.f99434u));
        }
        if (c16928a.f99441b != null) {
            String strM123279v = m123279v(cursor, this.f99436w);
            CharSequence charSequenceM123286k = strM123279v != null ? m123286k(strM123279v) : m123279v(cursor, this.f99435v);
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM123286k);
            TextView textView = c16928a.f99440a;
            if (zIsEmpty) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    c16928a.f99440a.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                c16928a.f99440a.setMaxLines(1);
            }
            m123298y(c16928a.f99441b, charSequenceM123286k);
        }
        ImageView imageView = c16928a.f99442c;
        if (imageView != null) {
            m123297x(imageView, m123293s(cursor), 4);
        }
        ImageView imageView2 = c16928a.f99443d;
        if (imageView2 != null) {
            m123297x(imageView2, m123294t(cursor), 8);
        }
        int i3 = this.f99432s;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c16928a.f99444e.setVisibility(8);
            return;
        }
        c16928a.f99444e.setVisibility(0);
        c16928a.f99444e.setTag(c16928a.f99440a.getText());
        c16928a.f99444e.setOnClickListener(this);
    }

    @Override // p149l.uvc0, p149l.gxb
    /* JADX INFO: renamed from: g */
    public View mo123284g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo123284g = super.mo123284g(context, cursor, viewGroup);
        viewMo123284g.setTag(new C16928a(viewMo123284g));
        ((ImageView) viewMo123284g.findViewById(s5c0.f162535s)).setImageResource(this.f99430q);
        return viewMo123284g;
    }

    @Override // p149l.gxb, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo128539f = mo128539f(this.f104855d, this.f104854c, viewGroup);
            if (viewMo128539f != null) {
                ((C16928a) viewMo128539f.getTag()).f99440a.setText(e.toString());
            }
            return viewMo128539f;
        }
    }

    @Override // p149l.gxb, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo123284g = mo123284g(this.f104855d, this.f104854c, viewGroup);
            if (viewMo123284g != null) {
                ((C16928a) viewMo123284g.getTag()).f99440a.setText(e.toString());
            }
            return viewMo123284g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final Drawable m123285j(String str) {
        Drawable.ConstantState constantState = this.f99429p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m123286k(CharSequence charSequence) {
        if (this.f99433t == null) {
            TypedValue typedValue = new TypedValue();
            this.f104855d.getTheme().resolveAttribute(n0c0.f136506O, typedValue, true);
            this.f99433t = this.f104855d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f99433t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: l */
    public final Drawable m123287l(ComponentName componentName) {
        PackageManager packageManager = this.f104855d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final Drawable m123288m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f99429p.containsKey(strFlattenToShortString)) {
            Drawable drawableM123287l = m123287l(componentName);
            this.f99429p.put(strFlattenToShortString, drawableM123287l != null ? drawableM123287l.getConstantState() : null);
            return drawableM123287l;
        }
        Drawable.ConstantState constantState = this.f99429p.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f99428o.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m123280A(mo128537b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m123280A(mo128537b());
    }

    /* JADX INFO: renamed from: o */
    public final Drawable m123289o(Cursor cursor) {
        Drawable drawableM123288m = m123288m(this.f99427n.getSearchActivity());
        return drawableM123288m != null ? drawableM123288m : this.f104855d.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f99426m.onQueryRefine((CharSequence) tag);
        }
    }

    /* JADX INFO: renamed from: p */
    public final Drawable m123290p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m123291q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f99428o.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                }
                throw th;
            }
        } catch (FileNotFoundException e3) {
            Objects.toString(uri);
            e3.getMessage();
            return null;
        }
        Objects.toString(uri);
        e3.getMessage();
        return null;
    }

    /* JADX INFO: renamed from: q */
    public Drawable m123291q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            csg0.m108511a("No authority: ", uri);
            return null;
        }
        try {
            Resources resourcesForApplication = this.f104855d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                csg0.m108511a("No path: ", uri);
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    csg0.m108511a("Single path segment is not a resource ID: ", uri);
                    return null;
                }
            } else {
                if (size != 2) {
                    csg0.m108511a("More than two path segments: ", uri);
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            csg0.m108511a("No resource found for: ", uri);
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            csg0.m108511a("No package found for authority: ", uri);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final Drawable m123292r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f99428o.getPackageName() + "/" + i;
            Drawable drawableM123285j = m123285j(str2);
            if (drawableM123285j != null) {
                return drawableM123285j;
            }
            Drawable drawableM114377e = e16.m114377e(this.f99428o, i);
            m123299z(str2, drawableM114377e);
            return drawableM114377e;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM123285j2 = m123285j(str);
            if (drawableM123285j2 != null) {
                return drawableM123285j2;
            }
            Drawable drawableM123290p = m123290p(Uri.parse(str));
            m123299z(str, drawableM123290p);
            return drawableM123290p;
        }
    }

    /* JADX INFO: renamed from: s */
    public final Drawable m123293s(Cursor cursor) {
        int i = this.f99437x;
        if (i == -1) {
            return null;
        }
        Drawable drawableM123292r = m123292r(cursor.getString(i));
        return drawableM123292r != null ? drawableM123292r : m123289o(cursor);
    }

    /* JADX INFO: renamed from: t */
    public final Drawable m123294t(Cursor cursor) {
        int i = this.f99438y;
        if (i == -1) {
            return null;
        }
        return m123292r(cursor.getString(i));
    }

    /* JADX INFO: renamed from: u */
    public Cursor m123295u(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter(Constants.KEY_LIMIT, String.valueOf(i));
        }
        return this.f104855d.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX INFO: renamed from: w */
    public void m123296w(int i) {
        this.f99432s = i;
    }

    /* JADX INFO: renamed from: x */
    public final void m123297x(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* JADX INFO: renamed from: y */
    public final void m123298y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m123299z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f99429p.put(str, drawable.getConstantState());
        }
    }
}
