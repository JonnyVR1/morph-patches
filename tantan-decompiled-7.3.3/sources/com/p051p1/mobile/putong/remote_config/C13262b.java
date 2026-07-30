package com.p051p1.mobile.putong.remote_config;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Dialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p151v.VList;
import p153l.gec0;
import p153l.hyc0;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b */
/* JADX INFO: loaded from: classes10.dex */
public class C13262b {

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b$a */
    public class a extends ArrayAdapter<String> {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            return textView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b$b */
    public class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f55111a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f55112b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TextView f55113c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f55114d;

        public b(ArrayAdapter arrayAdapter, Map map, TextView textView, String str) {
            this.f55111a = arrayAdapter;
            this.f55112b = map;
            this.f55113c = textView;
            this.f55114d = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(final Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ArrayAdapter arrayAdapter = this.f55111a;
            if (zIsEmpty) {
                arrayAdapter.clear();
                this.f55111a.addAll(this.f55112b.values());
                TextView textView = this.f55113c;
                if (textView != null) {
                    textView.setText(this.f55114d);
                    return;
                }
                return;
            }
            arrayAdapter.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = jyb.m147522n(this.f55112b.keySet(), new qcj() { // from class: l.cyc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).toLowerCase().contains(editable));
                }
            }).iterator();
            while (it.hasNext()) {
                arrayList.add((String) this.f55112b.get((String) it.next()));
            }
            this.f55111a.addAll(arrayList);
            TextView textView2 = this.f55113c;
            if (textView2 != null) {
                textView2.setText(" Search:" + ((Object) editable) + " find:" + arrayList.size() + SignParameters.NEW_LINE + this.f55114d);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m80531a(Context context) {
        Map<String, hyc0> mapM80512r = RemoteConfig.m80481x().m80512r();
        ArrayList<String> arrayList = new ArrayList(mapM80512r.keySet());
        Collections.sort(arrayList);
        HashMap map = new HashMap(mapM80512r.size());
        for (String str : arrayList) {
            hyc0 hyc0Var = mapM80512r.get(str);
            map.put(str, "【" + hyc0Var.mo137716a() + "】 -Key:" + str + "\n\t-Value:" + hyc0Var.asString());
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, qa00.m175859d(5.0f), 0, 0);
        TextView textView = new TextView(context);
        RemoteConfig.ConfigStep configStepM80489K = RemoteConfig.m80481x().m80489K();
        String str2 = " RemoteConfig in step: " + configStepM80489K + "\n MD5: " + ((configStepM80489K == RemoteConfig.ConfigStep.UID || configStepM80489K == RemoteConfig.ConfigStep.USER) ? RemoteConfig.m80464D() : RemoteConfig.m80463C()) + "\n K-V Size: " + mapM80512r.size();
        textView.setText(str2);
        textView.setTextColor(-65536);
        textView.setTextSize(12.0f);
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        appCompatEditText.setBackgroundColor(0);
        appCompatEditText.setHint(R.string.search_go);
        appCompatEditText.setTextSize(16.0f);
        appCompatEditText.setGravity(19);
        int iM175859d = qa00.m175859d(24.0f);
        appCompatEditText.setPadding(iM175859d, qa00.m175859d(16.0f), iM175859d, qa00.m175859d(16.0f));
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(3);
        a aVar = new a(context, gec0.f103783B);
        aVar.addAll(map.values());
        appCompatEditText.addTextChangedListener(new b(aVar, map, textView, str2));
        linearLayout.addView(appCompatEditText, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        VList vList = new VList(context);
        vList.setAdapter((ListAdapter) aVar);
        linearLayout.addView(vList, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        Dialog dialogM21566z = new Dialog.C4460e(context).m21519P(linearLayout, false).m21566z();
        dialogM21566z.getWindow().setSoftInputMode(16);
        dialogM21566z.show();
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.requestFocus();
    }
}
