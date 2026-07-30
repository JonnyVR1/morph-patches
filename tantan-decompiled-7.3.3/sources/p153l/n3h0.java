package p153l;

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
public class n3h0 extends x3d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: l */
    public final SearchManager f139982l;

    /* JADX INFO: renamed from: m */
    public final SearchView f139983m;

    /* JADX INFO: renamed from: n */
    public final SearchableInfo f139984n;

    /* JADX INFO: renamed from: o */
    public final Context f139985o;

    /* JADX INFO: renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f139986p;

    /* JADX INFO: renamed from: q */
    public final int f139987q;

    /* JADX INFO: renamed from: r */
    public boolean f139988r;

    /* JADX INFO: renamed from: s */
    public int f139989s;

    /* JADX INFO: renamed from: t */
    public ColorStateList f139990t;

    /* JADX INFO: renamed from: u */
    public int f139991u;

    /* JADX INFO: renamed from: v */
    public int f139992v;

    /* JADX INFO: renamed from: w */
    public int f139993w;

    /* JADX INFO: renamed from: x */
    public int f139994x;

    /* JADX INFO: renamed from: y */
    public int f139995y;

    /* JADX INFO: renamed from: z */
    public int f139996z;

    /* JADX INFO: renamed from: l.n3h0$a */
    public static final class C18772a {

        /* JADX INFO: renamed from: a */
        public final TextView f139997a;

        /* JADX INFO: renamed from: b */
        public final TextView f139998b;

        /* JADX INFO: renamed from: c */
        public final ImageView f139999c;

        /* JADX INFO: renamed from: d */
        public final ImageView f140000d;

        /* JADX INFO: renamed from: e */
        public final ImageView f140001e;

        public C18772a(View view) {
            this.f139997a = (TextView) view.findViewById(R.id.text1);
            this.f139998b = (TextView) view.findViewById(R.id.text2);
            this.f139999c = (ImageView) view.findViewById(R.id.icon1);
            this.f140000d = (ImageView) view.findViewById(R.id.icon2);
            this.f140001e = (ImageView) view.findViewById(xdc0.f193574s);
        }
    }

    public n3h0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f139988r = false;
        this.f139989s = 1;
        this.f139991u = -1;
        this.f139992v = -1;
        this.f139993w = -1;
        this.f139994x = -1;
        this.f139995y = -1;
        this.f139996z = -1;
        this.f139982l = (SearchManager) this.f181558d.getSystemService(FirebaseAnalytics.Event.SEARCH);
        this.f139983m = searchView;
        this.f139984n = searchableInfo;
        this.f139987q = searchView.getSuggestionCommitIconResId();
        this.f139985o = context;
        this.f139986p = weakHashMap;
    }

    /* JADX INFO: renamed from: n */
    public static String m161289n(Cursor cursor, String str) {
        return m161290v(cursor, cursor.getColumnIndex(str));
    }

    /* JADX INFO: renamed from: v */
    public static String m161290v(Cursor cursor, int i) {
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
    public final void m161291A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p153l.uyb, p153l.vyb.InterfaceC20955a
    /* JADX INFO: renamed from: a */
    public void mo161292a(Cursor cursor) {
        if (this.f139988r) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo161292a(cursor);
            if (cursor != null) {
                this.f139991u = cursor.getColumnIndex("suggest_text_1");
                this.f139992v = cursor.getColumnIndex("suggest_text_2");
                this.f139993w = cursor.getColumnIndex("suggest_text_2_url");
                this.f139994x = cursor.getColumnIndex("suggest_icon_1");
                this.f139995y = cursor.getColumnIndex("suggest_icon_2");
                this.f139996z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p153l.vyb.InterfaceC20955a
    /* JADX INFO: renamed from: c */
    public Cursor mo161293c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f139983m.getVisibility() == 0 && this.f139983m.getWindowVisibility() == 0) {
            try {
                Cursor cursorM161306u = m161306u(this.f139984n, string, 50);
                if (cursorM161306u != null) {
                    cursorM161306u.getCount();
                    return cursorM161306u;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // p153l.uyb, p153l.vyb.InterfaceC20955a
    public CharSequence convertToString(Cursor cursor) {
        String strM161289n;
        String strM161289n2;
        if (cursor == null) {
            return null;
        }
        String strM161289n3 = m161289n(cursor, "suggest_intent_query");
        if (strM161289n3 != null) {
            return strM161289n3;
        }
        if (this.f139984n.shouldRewriteQueryFromData() && (strM161289n2 = m161289n(cursor, "suggest_intent_data")) != null) {
            return strM161289n2;
        }
        if (!this.f139984n.shouldRewriteQueryFromText() || (strM161289n = m161289n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM161289n;
    }

    @Override // p153l.uyb
    /* JADX INFO: renamed from: d */
    public void mo161294d(View view, Context context, Cursor cursor) {
        C18772a c18772a = (C18772a) view.getTag();
        int i = this.f139996z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c18772a.f139997a != null) {
            m161309y(c18772a.f139997a, m161290v(cursor, this.f139991u));
        }
        if (c18772a.f139998b != null) {
            String strM161290v = m161290v(cursor, this.f139993w);
            CharSequence charSequenceM161297k = strM161290v != null ? m161297k(strM161290v) : m161290v(cursor, this.f139992v);
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM161297k);
            TextView textView = c18772a.f139997a;
            if (zIsEmpty) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    c18772a.f139997a.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                c18772a.f139997a.setMaxLines(1);
            }
            m161309y(c18772a.f139998b, charSequenceM161297k);
        }
        ImageView imageView = c18772a.f139999c;
        if (imageView != null) {
            m161308x(imageView, m161304s(cursor), 4);
        }
        ImageView imageView2 = c18772a.f140000d;
        if (imageView2 != null) {
            m161308x(imageView2, m161305t(cursor), 8);
        }
        int i3 = this.f139989s;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c18772a.f140001e.setVisibility(8);
            return;
        }
        c18772a.f140001e.setVisibility(0);
        c18772a.f140001e.setTag(c18772a.f139997a.getText());
        c18772a.f140001e.setOnClickListener(this);
    }

    @Override // p153l.x3d0, p153l.uyb
    /* JADX INFO: renamed from: g */
    public View mo161295g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo161295g = super.mo161295g(context, cursor, viewGroup);
        viewMo161295g.setTag(new C18772a(viewMo161295g));
        ((ImageView) viewMo161295g.findViewById(xdc0.f193574s)).setImageResource(this.f139987q);
        return viewMo161295g;
    }

    @Override // p153l.uyb, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo198584f = mo198584f(this.f181558d, this.f181557c, viewGroup);
            if (viewMo198584f != null) {
                ((C18772a) viewMo198584f.getTag()).f139997a.setText(e.toString());
            }
            return viewMo198584f;
        }
    }

    @Override // p153l.uyb, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo161295g = mo161295g(this.f181558d, this.f181557c, viewGroup);
            if (viewMo161295g != null) {
                ((C18772a) viewMo161295g.getTag()).f139997a.setText(e.toString());
            }
            return viewMo161295g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final Drawable m161296j(String str) {
        Drawable.ConstantState constantState = this.f139986p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m161297k(CharSequence charSequence) {
        if (this.f139990t == null) {
            TypedValue typedValue = new TypedValue();
            this.f181558d.getTheme().resolveAttribute(s8c0.f166778O, typedValue, true);
            this.f139990t = this.f181558d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f139990t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: l */
    public final Drawable m161298l(ComponentName componentName) {
        PackageManager packageManager = this.f181558d.getPackageManager();
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
    public final Drawable m161299m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f139986p.containsKey(strFlattenToShortString)) {
            Drawable drawableM161298l = m161298l(componentName);
            this.f139986p.put(strFlattenToShortString, drawableM161298l != null ? drawableM161298l.getConstantState() : null);
            return drawableM161298l;
        }
        Drawable.ConstantState constantState = this.f139986p.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f139985o.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m161291A(mo198582b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m161291A(mo198582b());
    }

    /* JADX INFO: renamed from: o */
    public final Drawable m161300o(Cursor cursor) {
        Drawable drawableM161299m = m161299m(this.f139984n.getSearchActivity());
        return drawableM161299m != null ? drawableM161299m : this.f181558d.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f139983m.onQueryRefine((CharSequence) tag);
        }
    }

    /* JADX INFO: renamed from: p */
    public final Drawable m161301p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m161302q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f139985o.getContentResolver().openInputStream(uri);
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
    public Drawable m161302q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            k0h0.m147792a("No authority: ", uri);
            return null;
        }
        try {
            Resources resourcesForApplication = this.f181558d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                k0h0.m147792a("No path: ", uri);
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    k0h0.m147792a("Single path segment is not a resource ID: ", uri);
                    return null;
                }
            } else {
                if (size != 2) {
                    k0h0.m147792a("More than two path segments: ", uri);
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            k0h0.m147792a("No resource found for: ", uri);
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            k0h0.m147792a("No package found for authority: ", uri);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final Drawable m161303r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f139985o.getPackageName() + "/" + i;
            Drawable drawableM161296j = m161296j(str2);
            if (drawableM161296j != null) {
                return drawableM161296j;
            }
            Drawable drawableM143192e = j26.m143192e(this.f139985o, i);
            m161310z(str2, drawableM143192e);
            return drawableM143192e;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM161296j2 = m161296j(str);
            if (drawableM161296j2 != null) {
                return drawableM161296j2;
            }
            Drawable drawableM161301p = m161301p(Uri.parse(str));
            m161310z(str, drawableM161301p);
            return drawableM161301p;
        }
    }

    /* JADX INFO: renamed from: s */
    public final Drawable m161304s(Cursor cursor) {
        int i = this.f139994x;
        if (i == -1) {
            return null;
        }
        Drawable drawableM161303r = m161303r(cursor.getString(i));
        return drawableM161303r != null ? drawableM161303r : m161300o(cursor);
    }

    /* JADX INFO: renamed from: t */
    public final Drawable m161305t(Cursor cursor) {
        int i = this.f139995y;
        if (i == -1) {
            return null;
        }
        return m161303r(cursor.getString(i));
    }

    /* JADX INFO: renamed from: u */
    public Cursor m161306u(SearchableInfo searchableInfo, String str, int i) {
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
        return this.f181558d.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX INFO: renamed from: w */
    public void m161307w(int i) {
        this.f139989s = i;
    }

    /* JADX INFO: renamed from: x */
    public final void m161308x(ImageView imageView, Drawable drawable, int i) {
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
    public final void m161309y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m161310z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f139986p.put(str, drawable.getConstantState());
        }
    }
}
