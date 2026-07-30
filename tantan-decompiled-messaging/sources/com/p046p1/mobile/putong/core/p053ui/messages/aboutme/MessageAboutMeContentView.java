package com.p046p1.mobile.putong.core.p053ui.messages.aboutme;

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
import p149l.l6c0;
import p149l.t100;
import p149l.vwb;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageAboutMeContentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f31689a;

    /* JADX INFO: renamed from: b */
    public boolean f31690b;

    /* JADX INFO: renamed from: c */
    public final int f31691c;

    /* JADX INFO: renamed from: d */
    public int f31692d;

    /* JADX INFO: renamed from: e */
    public TextView[] f31693e;

    /* JADX INFO: renamed from: f */
    public Set<String> f31694f;

    /* JADX INFO: renamed from: g */
    public List<String> f31695g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Pair<String, String>> f31696h;

    /* JADX INFO: renamed from: i */
    public TextView f31697i;

    /* JADX INFO: renamed from: j */
    public TextView f31698j;

    /* JADX INFO: renamed from: k */
    public TextView f31699k;

    /* JADX INFO: renamed from: l */
    public TextView f31700l;

    /* JADX INFO: renamed from: m */
    public TextView f31701m;

    public MessageAboutMeContentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31689a = false;
        this.f31690b = false;
        this.f31691c = 5;
        this.f31694f = new LinkedHashSet();
        this.f31695g = new ArrayList();
        m49011b(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m49010a(int i) {
        String str = (String) this.f31696h.get(i).second;
        if (!TextUtils.isEmpty(str)) {
            this.f31694f.addAll(Arrays.asList(str.split(Constants.SEPARATOR_COMMA)));
        }
        String str2 = (String) this.f31696h.get(i).first;
        if (this.f31695g.contains(str2)) {
            return;
        }
        this.f31695g.add(str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m49011b(Context context, AttributeSet attributeSet, int i) {
        View.inflate(context, l6c0.f126278D1, this);
        this.f31697i = (TextView) findViewById(y4c0.f196100b5);
        this.f31698j = (TextView) findViewById(y4c0.f196107c5);
        this.f31699k = (TextView) findViewById(y4c0.f196114d5);
        this.f31700l = (TextView) findViewById(y4c0.f196121e5);
        this.f31701m = (TextView) findViewById(y4c0.f196128f5);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31697i.setLineHeight(t100.m186890d(18.0f));
        }
    }

    public JSONArray getShowContent() {
        return new JSONArray((Collection) this.f31695g);
    }

    public Set<String> getShowedTagType() {
        return this.f31694f;
    }

    public String getShowedTrackParams() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f31694f.iterator();
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
        if (this.f31689a) {
            return;
        }
        int lineCount = 0;
        for (int i3 = 0; i3 < this.f31692d; i3++) {
            if (this.f31693e[i3].getLineCount() + lineCount >= 5) {
                if (this.f31693e[i3].getLineCount() + lineCount > 5) {
                    m49010a(i3);
                    this.f31693e[i3].setMaxLines(7 - lineCount);
                } else if (this.f31693e[i3].getLineCount() + lineCount == 5) {
                    m49010a(i3);
                }
                for (int i4 = i3 + 1; i4 < 5; i4++) {
                    this.f31693e[i4].setVisibility(8);
                }
                break;
            }
            m49010a(i3);
            lineCount += this.f31693e[i3].getLineCount();
        }
        this.f31689a = true;
        super.onMeasure(i, i2);
    }

    public void setContent(ArrayList<Pair<String, String>> arrayList) {
        if (!this.f31690b) {
            if (vwb.m200296J(arrayList)) {
                return;
            }
            this.f31696h = arrayList;
            this.f31693e = new TextView[]{this.f31697i, this.f31698j, this.f31699k, this.f31700l, this.f31701m};
            this.f31692d = Math.min(arrayList.size(), this.f31693e.length);
            for (int i = 0; i < this.f31692d; i++) {
                this.f31693e[i].setVisibility(0);
                this.f31693e[i].setText((CharSequence) arrayList.get(i).first);
            }
        }
        this.f31690b = true;
    }

    public MessageAboutMeContentView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageAboutMeContentView(Context context) {
        this(context, null);
    }
}
