package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$string;
import androidx.customview.view.AbsSavedState;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p149l.aac0;
import p149l.dti0;
import p149l.fel0;
import p149l.fvg0;
import p149l.g7c0;
import p149l.gbl0;
import p149l.gxb;
import p149l.n0c0;
import p149l.p2c0;
import p149l.qd5;
import p149l.qri0;
import p149l.s5c0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements qd5 {
    static final boolean DBG = false;
    static final C0148k HIDDEN_METHOD_INVOKER = new C0148k();
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private InterfaceC0149l mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private InterfaceC0150m mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private InterfaceC0151n mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    gxb mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private C0152o mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0138a implements TextWatcher {
        public C0138a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.onTextChanged(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0139b implements Runnable {
        public RunnableC0139b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.updateFocusedState();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0140c implements Runnable {
        public RunnableC0140c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gxb gxbVar = SearchView.this.mSuggestionsAdapter;
            if (gxbVar instanceof fvg0) {
                gxbVar.mo123281a(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0141d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0141d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0142e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0142e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.adjustDropDownSizeAndPosition();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0143f implements View.OnClickListener {
        public ViewOnClickListenerC0143f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.mSearchButton) {
                searchView.onSearchClicked();
                return;
            }
            if (view == searchView.mCloseButton) {
                searchView.onCloseClicked();
                return;
            }
            if (view == searchView.mGoButton) {
                searchView.onSubmitQuery();
            } else if (view == searchView.mVoiceButton) {
                searchView.onVoiceClicked();
            } else if (view == searchView.mSearchSrcTextView) {
                searchView.forceSuggestionQuery();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0144g implements View.OnKeyListener {
        public ViewOnKeyListenerC0144g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.mSearchable == null) {
                return false;
            }
            if (searchView.mSearchSrcTextView.isPopupShowing() && SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                return SearchView.this.onSuggestionsKey(view, i, keyEvent);
            }
            if (SearchView.this.mSearchSrcTextView.m595a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.launchQuerySearch(0, null, searchView2.mSearchSrcTextView.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0145h implements TextView.OnEditorActionListener {
        public C0145h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.onSubmitQuery();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0146i implements AdapterView.OnItemClickListener {
        public C0146i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.onItemClicked(i, 0, null);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0147j implements AdapterView.OnItemSelectedListener {
        public C0147j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.onItemSelected(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0148k {

        /* JADX INFO: renamed from: a */
        public Method f729a;

        /* JADX INFO: renamed from: b */
        public Method f730b;

        /* JADX INFO: renamed from: c */
        public Method f731c;

        public C0148k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f729a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f730b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f731c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* JADX INFO: renamed from: a */
        public void m597a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f730b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m598b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f729a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m599c(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f731c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0149l {
        boolean onClose();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0150m {
        /* JADX INFO: renamed from: a */
        boolean mo600a(String str);

        /* JADX INFO: renamed from: b */
        boolean mo601b(String str);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC0151n {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0152o extends TouchDelegate {

        /* JADX INFO: renamed from: a */
        public final View f732a;

        /* JADX INFO: renamed from: b */
        public final Rect f733b;

        /* JADX INFO: renamed from: c */
        public final Rect f734c;

        /* JADX INFO: renamed from: d */
        public final Rect f735d;

        /* JADX INFO: renamed from: e */
        public final int f736e;

        /* JADX INFO: renamed from: f */
        public boolean f737f;

        public C0152o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f736e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f733b = new Rect();
            this.f735d = new Rect();
            this.f734c = new Rect();
            m602a(rect, rect2);
            this.f732a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m602a(Rect rect, Rect rect2) {
            this.f733b.set(rect);
            this.f735d.set(rect);
            Rect rect3 = this.f735d;
            int i = this.f736e;
            rect3.inset(-i, -i);
            this.f734c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f737f;
                    if (z2 && !this.f735d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f737f;
                    this.f737f = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f733b.contains(x, y)) {
                this.f737f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f734c.contains(x, y)) {
                Rect rect = this.f734c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f732a.getWidth() / 2, this.f732a.getHeight() / 2);
            }
            return this.f732a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new RunnableC0139b();
        this.mReleaseCursorRunnable = new RunnableC0140c();
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        ViewOnClickListenerC0143f viewOnClickListenerC0143f = new ViewOnClickListenerC0143f();
        this.mOnClickListener = viewOnClickListenerC0143f;
        this.mTextKeyListener = new ViewOnKeyListenerC0144g();
        C0145h c0145h = new C0145h();
        this.mOnEditorActionListener = c0145h;
        C0146i c0146i = new C0146i();
        this.mOnItemClickListener = c0146i;
        C0147j c0147j = new C0147j();
        this.mOnItemSelectedListener = c0147j;
        this.mTextWatcher = new C0138a();
        qri0 qri0VarM175993u = qri0.m175993u(context, attributeSet, aac0.f68461i2, i, 0);
        LayoutInflater.from(context).inflate(qri0VarM175993u.m176007n(aac0.f68511s2, g7c0.f101372t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(s5c0.f162504J);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(s5c0.f162500F);
        View viewFindViewById = findViewById(s5c0.f162503I);
        this.mSearchPlate = viewFindViewById;
        View viewFindViewById2 = findViewById(s5c0.f162510P);
        this.mSubmitArea = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(s5c0.f162498D);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(s5c0.f162501G);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(s5c0.f162499E);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(s5c0.f162505K);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(s5c0.f162502H);
        this.mCollapsedIcon = imageView5;
        gbl0.m125207m0(viewFindViewById, qri0VarM175993u.m176000g(aac0.f68516t2));
        gbl0.m125207m0(viewFindViewById2, qri0VarM175993u.m176000g(aac0.f68536x2));
        imageView.setImageDrawable(qri0VarM175993u.m176000g(aac0.f68531w2));
        imageView2.setImageDrawable(qri0VarM175993u.m176000g(aac0.f68501q2));
        imageView3.setImageDrawable(qri0VarM175993u.m176000g(aac0.f68486n2));
        imageView4.setImageDrawable(qri0VarM175993u.m176000g(aac0.f68546z2));
        imageView5.setImageDrawable(qri0VarM175993u.m176000g(aac0.f68531w2));
        this.mSearchHintIcon = qri0VarM175993u.m176000g(aac0.f68526v2);
        dti0.m113570a(imageView, getResources().getString(R$string.f113m));
        this.mSuggestionRowLayout = qri0VarM175993u.m176007n(aac0.f68541y2, g7c0.f101371s);
        this.mSuggestionCommitIconResId = qri0VarM175993u.m176007n(aac0.f68491o2, 0);
        imageView.setOnClickListener(viewOnClickListenerC0143f);
        imageView3.setOnClickListener(viewOnClickListenerC0143f);
        imageView2.setOnClickListener(viewOnClickListenerC0143f);
        imageView4.setOnClickListener(viewOnClickListenerC0143f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0143f);
        searchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchAutoComplete.setOnEditorActionListener(c0145h);
        searchAutoComplete.setOnItemClickListener(c0146i);
        searchAutoComplete.setOnItemSelectedListener(c0147j);
        searchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0141d());
        setIconifiedByDefault(qri0VarM175993u.m175994a(aac0.f68506r2, true));
        int iM175999f = qri0VarM175993u.m175999f(aac0.f68471k2, -1);
        if (iM175999f != -1) {
            setMaxWidth(iM175999f);
        }
        this.mDefaultQueryHint = qri0VarM175993u.m176009p(aac0.f68496p2);
        this.mQueryHint = qri0VarM175993u.m176009p(aac0.f68521u2);
        int iM176004k = qri0VarM175993u.m176004k(aac0.f68481m2, -1);
        if (iM176004k != -1) {
            setImeOptions(iM176004k);
        }
        int iM176004k2 = qri0VarM175993u.m176004k(aac0.f68476l2, -1);
        if (iM176004k2 != -1) {
            setInputType(iM176004k2);
        }
        setFocusable(qri0VarM175993u.m175994a(aac0.f68466j2, true));
        qri0VarM175993u.m176012v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0142e());
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra(BLivePkInviteSource.query, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String str) {
        String strM123278n;
        try {
            try {
                String strM123278n2 = fvg0.m123278n(cursor, "suggest_intent_action");
                if (strM123278n2 == null) {
                    strM123278n2 = this.mSearchable.getSuggestIntentAction();
                }
                if (strM123278n2 == null) {
                    strM123278n2 = "android.intent.action.SEARCH";
                }
                String str2 = strM123278n2;
                String strM123278n3 = fvg0.m123278n(cursor, "suggest_intent_data");
                if (strM123278n3 == null) {
                    strM123278n3 = this.mSearchable.getSuggestIntentData();
                }
                if (strM123278n3 != null && (strM123278n = fvg0.m123278n(cursor, "suggest_intent_data_id")) != null) {
                    strM123278n3 = strM123278n3 + "/" + Uri.encode(strM123278n);
                }
                return createIntent(str2, strM123278n3 == null ? null : Uri.parse(strM123278n3), fvg0.m123278n(cursor, "suggest_intent_extra_data"), fvg0.m123278n(cursor, "suggest_intent_query"), i, str);
            } catch (RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.mSearchSrcTextView.getTextSize()) * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p2c0.f146838g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p2c0.f146839h);
    }

    private boolean hasVoiceSearch() {
        Intent intent;
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else {
                intent = this.mSearchable.getVoiceSearchLaunchRecognizer() ? this.mVoiceAppSearchIntent : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified();
    }

    private void launchIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e) {
            Log.e(LOG_TAG, "Failed launch activity: " + intent, e);
        }
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursorMo128537b = this.mSuggestionsAdapter.mo128537b();
        if (cursorMo128537b == null || !cursorMo128537b.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursorMo128537b, i2, str));
        return true;
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursorMo128537b = this.mSuggestionsAdapter.mo128537b();
        if (cursorMo128537b == null) {
            return;
        }
        if (!cursorMo128537b.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.mSuggestionsAdapter.convertToString(cursorMo128537b);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void updateCloseButton() {
        boolean zIsEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mCloseButton.setVisibility(!zIsEmpty || (this.mIconifiedByDefault && !this.mExpandedInActionView) ? 0 : 8);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        gxb gxbVar = this.mSuggestionsAdapter;
        if (gxbVar != null) {
            gxbVar.mo123281a(null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            fvg0 fvg0Var = new fvg0(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = fvg0Var;
            this.mSearchSrcTextView.setAdapter(fvg0Var);
            ((fvg0) this.mSuggestionsAdapter).m123296w(this.mQueryRefinement ? 2 : 1);
        }
    }

    private void updateSubmitArea() {
        this.mSubmitArea.setVisibility((isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    private void updateSubmitButton(boolean z) {
        this.mGoButton.setVisibility((this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z || !this.mVoiceButtonEnabled)) ? 0 : 8);
    }

    private void updateViewsVisibility(boolean z) {
        this.mIconified = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        updateSubmitButton(!zIsEmpty);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        if (this.mCollapsedIcon.getDrawable() != null && !this.mIconifiedByDefault) {
            i = 0;
        }
        this.mCollapsedIcon.setVisibility(i);
        updateCloseButton();
        updateVoiceButton(zIsEmpty);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    public void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM121043b = fel0.m121043b(this);
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(p2c0.f146836e) + resources.getDimensionPixelSize(p2c0.f146837f) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.mSearchSrcTextView.setDropDownHorizontalOffset(zM121043b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    public void forceSuggestionQuery() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (i >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        C0148k c0148k = HIDDEN_METHOD_INVOKER;
        c0148k.m598b(searchAutoComplete);
        c0148k.m597a(this.mSearchSrcTextView);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public gxb getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    @Override // p149l.qd5
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override // p149l.qd5
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
        this.mSearchSrcTextView.setText("");
        setIconified(false);
    }

    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.mIconifiedByDefault) {
            InterfaceC0149l interfaceC0149l = this.mOnCloseListener;
            if (interfaceC0149l == null || !interfaceC0149l.onClose()) {
                clearFocus();
                updateViewsVisibility(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public boolean onItemClicked(int i, int i2, String str) {
        launchSuggestion(i, 0, null);
        this.mSearchSrcTextView.setImeVisibility(false);
        dismissSuggestions();
        return true;
    }

    public boolean onItemSelected(int i) {
        rewriteQueryFromSuggestion(i);
        return true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            Rect rect = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect2 = this.mSearchSrcTextViewBounds;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0152o c0152o = this.mTouchDelegate;
            if (c0152o != null) {
                c0152o.m602a(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
                return;
            }
            C0152o c0152o2 = new C0152o(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
            this.mTouchDelegate = c0152o2;
            setTouchDelegate(c0152o2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        updateViewsVisibility(savedState.isIconified);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isIconified = isIconified();
        return savedState;
    }

    public void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0150m interfaceC0150m = this.mOnQueryChangeListener;
        if (interfaceC0150m == null || !interfaceC0150m.mo601b(text.toString())) {
            if (this.mSearchable != null) {
                launchQuerySearch(0, null, text.toString());
            }
            this.mSearchSrcTextView.setImeVisibility(false);
            dismissSuggestions();
        }
    }

    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.mSearchSrcTextView.setSelection(i == 21 ? 0 : this.mSearchSrcTextView.length());
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                HIDDEN_METHOD_INVOKER.m599c(this.mSearchSrcTextView, true);
                return true;
            }
            if (i == 19) {
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        updateSubmitButton(!zIsEmpty);
        updateVoiceButton(zIsEmpty);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.mo600a(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    public void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (zRequestFocus) {
            updateViewsVisibility(false);
        }
        return zRequestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault == z) {
            return;
        }
        this.mIconifiedByDefault = z;
        updateViewsVisibility(z);
        updateQueryHint();
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0149l interfaceC0149l) {
        this.mOnCloseListener = interfaceC0149l;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0150m interfaceC0150m) {
        this.mOnQueryChangeListener = interfaceC0150m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0151n interfaceC0151n) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        gxb gxbVar = this.mSuggestionsAdapter;
        if (gxbVar instanceof fvg0) {
            ((fvg0) gxbVar).m123296w(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        boolean zHasVoiceSearch = hasVoiceSearch();
        this.mVoiceButtonEnabled = zHasVoiceSearch;
        if (zHasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(gxb gxbVar) {
        this.mSuggestionsAdapter = gxbVar;
        this.mSearchSrcTextView.setAdapter(gxbVar);
    }

    public void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0136a();
        boolean isIconified;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        public static class C0136a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isIconified = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.isIconified + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.isIconified));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: d */
        public int f714d;

        /* JADX INFO: renamed from: e */
        public SearchView f715e;

        /* JADX INFO: renamed from: f */
        public boolean f716f;

        /* JADX INFO: renamed from: g */
        public final Runnable f717g;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0137a implements Runnable {
            public RunnableC0137a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m596b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f717g = new RunnableC0137a();
            this.f714d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX INFO: renamed from: a */
        public boolean m595a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* JADX INFO: renamed from: b */
        public void m596b() {
            if (this.f716f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f716f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f714d <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f716f) {
                removeCallbacks(this.f717g);
                post(this.f717g);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f715e.onTextFocusChanged();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f715e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f715e.hasFocus() && getVisibility() == 0) {
                this.f716f = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    SearchView.HIDDEN_METHOD_INVOKER.m599c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f716f = false;
                removeCallbacks(this.f717g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f716f = true;
                    return;
                }
                this.f716f = false;
                removeCallbacks(this.f717g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f715e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f714d = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, n0c0.f136525q);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n0c0.f136502K);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
