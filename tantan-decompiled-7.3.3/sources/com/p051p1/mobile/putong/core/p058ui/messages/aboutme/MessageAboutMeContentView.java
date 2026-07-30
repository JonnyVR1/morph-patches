package com.p051p1.mobile.putong.core.p058ui.messages.aboutme;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import p153l.edc0;
import p153l.jyb;
import p153l.qa00;
import p153l.qec0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageAboutMeContentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f32537a;

    /* JADX INFO: renamed from: b */
    public boolean f32538b;

    /* JADX INFO: renamed from: c */
    public final int f32539c;

    /* JADX INFO: renamed from: d */
    public int f32540d;

    /* JADX INFO: renamed from: e */
    public TextView[] f32541e;

    /* JADX INFO: renamed from: f */
    public Set<String> f32542f;

    /* JADX INFO: renamed from: g */
    public List<String> f32543g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Pair<String, String>> f32544h;

    /* JADX INFO: renamed from: i */
    public TextView f32545i;

    /* JADX INFO: renamed from: j */
    public TextView f32546j;

    /* JADX INFO: renamed from: k */
    public TextView f32547k;

    /* JADX INFO: renamed from: l */
    public TextView f32548l;

    /* JADX INFO: renamed from: m */
    public TextView f32549m;

    public MessageAboutMeContentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32537a = false;
        this.f32538b = false;
        this.f32539c = 5;
        this.f32542f = new LinkedHashSet();
        this.f32543g = new ArrayList();
        m50194b(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m50193a(int i) {
        String str = (String) this.f32544h.get(i).second;
        if (!TextUtils.isEmpty(str)) {
            this.f32542f.addAll(Arrays.asList(str.split(Constants.SEPARATOR_COMMA)));
        }
        String str2 = (String) this.f32544h.get(i).first;
        if (this.f32543g.contains(str2)) {
            return;
        }
        this.f32543g.add(str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m50194b(Context context, AttributeSet attributeSet, int i) {
        View.inflate(context, qec0.f156834D1, this);
        this.f32545i = (TextView) findViewById(edc0.f93335b5);
        this.f32546j = (TextView) findViewById(edc0.f93342c5);
        this.f32547k = (TextView) findViewById(edc0.f93349d5);
        this.f32548l = (TextView) findViewById(edc0.f93356e5);
        this.f32549m = (TextView) findViewById(edc0.f93363f5);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f32545i.setLineHeight(qa00.m175859d(18.0f));
        }
    }

    public JSONArray getShowContent() {
        return new JSONArray((Collection) this.f32543g);
    }

    public Set<String> getShowedTagType() {
        return this.f32542f;
    }

    public String getShowedTrackParams() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f32542f.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(Constants.SEPARATOR_COMMA);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f32537a) {
            return;
        }
        int lineCount = 0;
        for (int i3 = 0; i3 < this.f32540d; i3++) {
            if (this.f32541e[i3].getLineCount() + lineCount >= 5) {
                if (this.f32541e[i3].getLineCount() + lineCount > 5) {
                    m50193a(i3);
                    this.f32541e[i3].setMaxLines(7 - lineCount);
                } else if (this.f32541e[i3].getLineCount() + lineCount == 5) {
                    m50193a(i3);
                }
                for (int i4 = i3 + 1; i4 < 5; i4++) {
                    this.f32541e[i4].setVisibility(8);
                }
                break;
            }
            m50193a(i3);
            lineCount += this.f32541e[i3].getLineCount();
        }
        this.f32537a = true;
        super.onMeasure(i, i2);
    }

    public void setContent(ArrayList<Pair<String, String>> arrayList) {
        if (!this.f32538b) {
            if (jyb.m147479J(arrayList)) {
                return;
            }
            this.f32544h = arrayList;
            this.f32541e = new TextView[]{this.f32545i, this.f32546j, this.f32547k, this.f32548l, this.f32549m};
            this.f32540d = Math.min(arrayList.size(), this.f32541e.length);
            for (int i = 0; i < this.f32540d; i++) {
                this.f32541e[i].setVisibility(0);
                this.f32541e[i].setText((CharSequence) arrayList.get(i).first);
            }
        }
        this.f32538b = true;
    }

    public MessageAboutMeContentView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageAboutMeContentView(Context context) {
        this(context, null);
    }
}
