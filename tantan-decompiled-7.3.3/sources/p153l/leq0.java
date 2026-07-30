package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p151v.AutoVDraweeView;
import p151v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class leq0 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Context f131775a;

    /* JADX INFO: renamed from: b */
    public List<Conversation> f131776b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public final Map<String, Message> f131777c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Set<String> f131778d = new HashSet();

    /* JADX INFO: renamed from: l.leq0$a */
    public static class C18385a {

        /* JADX INFO: renamed from: a */
        public AutoVDraweeView f131779a;

        /* JADX INFO: renamed from: b */
        public View f131780b;

        /* JADX INFO: renamed from: c */
        public VText_NoTopPadding f131781c;

        /* JADX INFO: renamed from: d */
        public View f131782d;

        /* JADX INFO: renamed from: e */
        public VText_NoTopPadding f131783e;

        /* JADX INFO: renamed from: f */
        public VText_NoTopPadding f131784f;

        /* JADX INFO: renamed from: g */
        public AutoVDraweeView f131785g;

        public C18385a(View view) {
            this.f131779a = (AutoVDraweeView) view.findViewById(adc0.f69871Df);
            this.f131780b = view.findViewById(adc0.f70007Lf);
            this.f131781c = (VText_NoTopPadding) view.findViewById(adc0.f69990Kf);
            this.f131782d = view.findViewById(adc0.f69973Jf);
            this.f131783e = (VText_NoTopPadding) view.findViewById(adc0.f70058Of);
            this.f131784f = (VText_NoTopPadding) view.findViewById(adc0.f70075Pf);
            this.f131785g = (AutoVDraweeView) view.findViewById(adc0.f69922Gf);
        }
    }

    public leq0(Context context) {
        this.f131775a = context;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m153925b(C18385a c18385a) {
        ViewGroup.LayoutParams layoutParams;
        if (c18385a.f131782d == null) {
            return;
        }
        int width = c18385a.f131781c.getWidth();
        if (width > 0 && (layoutParams = c18385a.f131782d.getLayoutParams()) != null) {
            layoutParams.width = width + 4;
            c18385a.f131782d.setLayoutParams(layoutParams);
        }
        c18385a.f131781c.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public final Message m153927d(Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.f56859id)) {
            Message message = this.f131777c.get(conversation.f56859id);
            if (message != null) {
                return message;
            }
            if (this.f131778d.contains(conversation.f56859id)) {
                return null;
            }
            this.f131778d.add(conversation.f56859id);
            final String str = conversation.f56859id;
            l51.m152919y(new Runnable() { // from class: l.ieq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114607a.m153931h(str);
                }
            });
        }
        return null;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        if (i < 0 || i >= this.f131776b.size()) {
            return null;
        }
        return this.f131776b.get(i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m153929f(User user) {
        if (CoreModule.f18264c.f20330N0.m32969j3(user)) {
            return true;
        }
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        if (lastActiveTimeMillis <= 0) {
            return false;
        }
        long jM174454o = pzi0.m174454o() - lastActiveTimeMillis;
        return (jM174454o >= 0 && jM174454o <= Constants.INBOX_V2_THROTTLE_WINDOW_MS) || (jM174454o >= 86400000 && jM174454o <= 432000000);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m153930g(Message message, String str) {
        if (message != null) {
            this.f131777c.put(str, message);
            notifyDataSetChanged();
        }
        this.f131778d.remove(str);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f131776b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C18385a c18385a;
        if (view == null) {
            view = LayoutInflater.from(this.f131775a).inflate(kec0.f125784cd, viewGroup, false);
            c18385a = new C18385a(view);
            view.setTag(c18385a);
        } else {
            c18385a = (C18385a) view.getTag();
        }
        Conversation item = getItem(i);
        if (item != null) {
            m153933j(c18385a, item);
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m153931h(final String str) {
        Collection collectionM208674j = CoreModule.f18272k.f115535c.m189476l0(str).m208674j();
        final Message message = jyb.m147479J(collectionM208674j) ? null : (Message) jyb.m147529r(collectionM208674j, new qcj() { // from class: l.jeq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(br5.m106040k((Message) obj));
            }
        });
        l51.m152887G(new Runnable() { // from class: l.keq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f126207a.m153930g(message, str);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m153932i(C18385a c18385a, Conversation conversation, Message message) {
        boolean zM106041l = br5.m106041l();
        String str = message != null ? message.value : "";
        boolean zIsEmpty = TextUtils.isEmpty(str);
        c18385a.f131783e.setTextColor(zM106041l ? Color.parseColor("#999999") : RoundedDrawable.DEFAULT_BORDER_COLOR);
        c18385a.f131783e.setTypeface(lyh0.m156283c(zM106041l ? 2 : 3));
        c18385a.f131783e.setText(str);
        double d = conversation.latestTime;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            String strM174442G = pzi0.m174442G(d);
            VText_NoTopPadding vText_NoTopPadding = c18385a.f131784f;
            if (!zIsEmpty) {
                strM174442G = " · " + strM174442G;
            }
            vText_NoTopPadding.setText(strM174442G);
            bnl0.m105524M(c18385a.f131784f, true);
        } else {
            bnl0.m105524M(c18385a.f131784f, false);
        }
        if (message == null || jyb.m147479J(message.media) || message.media.get(0).cover() == null || TextUtils.isEmpty(message.media.get(0).cover().url)) {
            bnl0.m105524M(c18385a.f131785g, false);
            return;
        }
        Picture pictureCover = message.media.get(0).cover();
        bnl0.m105524M(c18385a.f131785g, true);
        c18385a.f131785g.setImageUrl(pictureCover.url);
        c18385a.f131785g.setZoomAnimationKey(Media.URL_TO_CACHEKEY(pictureCover.url) + "||" + message.f56859id);
    }

    /* JADX INFO: renamed from: j */
    public final void m153933j(final C18385a c18385a, Conversation conversation) {
        View view;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser);
        boolean zM106041l = br5.m106041l();
        if (userM116503Pa != null && userM116503Pa.m61308fp() != null) {
            if (zM106041l) {
                uqb0.f180374G.m127125Q0(c18385a.f131779a, userM116503Pa.m61308fp().profileSmall());
            } else {
                uqb0.f180374G.m127120O(c18385a.f131779a, userM116503Pa.m61308fp().profileSmall().formatted(), 4, 10);
            }
        }
        bnl0.m105524M(c18385a.f131780b, userM116503Pa != null && m153929f(userM116503Pa));
        c18385a.f131781c.setText(userM116503Pa != null ? userM116503Pa.name : "");
        if (zM106041l || (view = c18385a.f131782d) == null) {
            bnl0.m105524M(c18385a.f131782d, false);
            bnl0.m105524M(c18385a.f131781c, true);
        } else {
            bnl0.m105524M(view, true);
            c18385a.f131781c.setVisibility(4);
            c18385a.f131781c.post(new Runnable() { // from class: l.heq0
                @Override // java.lang.Runnable
                public final void run() {
                    leq0.m153925b(c18385a);
                }
            });
        }
        m153932i(c18385a, conversation, m153927d(conversation));
    }

    /* JADX INFO: renamed from: k */
    public void m153934k(List<Conversation> list) {
        String str;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f131776b = list;
        HashSet hashSet = new HashSet();
        for (Conversation conversation : this.f131776b) {
            if (conversation != null && (str = conversation.f56859id) != null) {
                hashSet.add(str);
            }
        }
        this.f131777c.keySet().retainAll(hashSet);
        this.f131778d.retainAll(hashSet);
        notifyDataSetChanged();
    }
}
