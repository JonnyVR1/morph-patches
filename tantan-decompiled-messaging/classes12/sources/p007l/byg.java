package p007l;

import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.PoiMarkInfoData;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.Index;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import l.f30;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class byg extends b8c implements pp2<FeedData> {

    /* JADX INFO: renamed from: c */
    public ti00 f6464c;

    /* JADX INFO: renamed from: d */
    public b900 f6465d;

    /* JADX INFO: renamed from: e */
    public orh0<DbLinks> f6466e;

    /* JADX INFO: renamed from: f */
    public orh0<DbLinks> f6467f;

    /* JADX INFO: renamed from: g */
    public z980 f6468g;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m9057l(Moment moment, Moment moment2) {
        if (moment2 != null) {
            moment.localCreatedSession = moment2.localCreatedSession;
            boolean z = true;
            moment.localInFeed = moment.localInFeed || moment2.localInFeed;
            if (!moment.localInUserFeed && !moment2.localInUserFeed) {
                z = false;
            }
            moment.localInUserFeed = z;
        }
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: c */
    public int mo8745c() {
        return 18;
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: d */
    public int mo8746d() {
        return 1;
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: e */
    public String mo8747e() {
        return "feedDb";
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> mo8748f() {
        return super.mo8748f();
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: g */
    public void mo8749g() {
        rpq.m13943b().m13947e(FeedData.JSON_ADAPTER, this);
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: h */
    public void mo8750h() {
        mrf0<Moment> mrf0Var = Moment.DB_ADAPTER;
        Column column = Moment.CREATEDTIME;
        this.f6464c = new ti00(this, Moments.TYPE, mrf0Var, vwb.f0(new Index[]{new Index(new Column[]{Moment.LOCALINUSERFEED, Moment.OWNER, column}), new Index(new Column[]{Moment.LOCALINFEED, column})}), MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f6465d = new b900(this, "activities", MomentActivity.DB_ADAPTER, vwb.f0(new Index[]{new Index(new Column[]{MomentActivity.CREATEDTIME})}), MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f6466e = new orh0<>(this, "moment_links", DbLinks.DB_ADAPTER, null, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f6467f = new orh0<>(this, "comment_links", DbLinks.DB_ADAPTER, null, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f6468g = new z980(this, "poi_mark_info", PoiMarkInfoData.DB_ADAPTER, null, 100);
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: i */
    public void mo8751i() {
        super.mo8751i();
        rpq.m13943b().m13951i(this, FeedData.JSON_ADAPTER);
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: j */
    public void mo8752j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 0:
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN hyperlink_c TEXT");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN str_settings_visibility_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN str_dynamicType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN str_momentType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN str_settings_userSetVisibility_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6465d.f11572d + " ADD COLUMN str_action_c TEXT");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN userSetVisibility_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN str_userSetVisibility_c TEXT");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN simpleActivity_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN simpleActivity_name_c TEXT");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_sendFrom_id_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_sendFrom_name_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_sendFrom_sourceType_c TEXT DEFAULT ''");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6465d.f11572d + " ADD COLUMN parentMessageid_c TEXT");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN group_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN group_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN group_lastJoined_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_share_title_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_share_description_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_share_url_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_share_landingPage_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_share_name_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_share_shareFrom_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN additionalData_share_testId_c TEXT DEFAULT ''");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN deeplink_c TEXT");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN thirdShareSource_sourceId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN thirdShareSource_sourceType_c TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN attitudeId_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN attitudes_count_c INTEGER");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6465d.f11572d + " ADD COLUMN replyMessageId_c TEXT");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN shareMyVote_c INTEGER");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN simpleActivity_url_c TEXT");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN allowForward_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN forwards_count_c INTEGER");
            case 15:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f6468g.f11572d + " (_id INTEGER PRIMARY KEY,id_c TEXT,poiName_c TEXT,latitude_c REAL,longitude_c REAL,address_c TEXT,triggerDate_c INTEGER,punchInDate_c INTEGER,triggerTimes_c INTEGER)");
            case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6464c.f11572d + " ADD COLUMN isNewUserAIMoment_c INTEGER");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6465d.f11572d + " ADD COLUMN userIds_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f6465d.f11572d + " ADD COLUMN count_c INTEGER");
                break;
        }
    }

    @Override // p007l.pp2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo9059a(Envelope envelope, final FeedData feedData, boolean z, boolean z2, boolean z3) {
        for (final Moment moment : feedData.moments) {
            PartialIdList partialIdList = moment.messages;
            if (partialIdList != null) {
                if (vwb.y(vwb.a0(partialIdList.ids.size()), new w9j() { // from class: l.yxg
                    public final Object call(Object obj) {
                        return Boolean.valueOf(vwb.m(feedData.messages, new w9j() { // from class: l.ayg
                            public final Object call(Object obj2) {
                                MomentMessage momentMessage = (MomentMessage) obj2;
                                return Boolean.valueOf(momentMessage.localInMoment && ((CopyObject) momentMessage).id.equals(moment.messages.ids.get(num.intValue())));
                            }
                        }));
                    }
                })) {
                    FeedModule.m1140H().K9(((DbObject) moment).id, moment.messages.ids, false);
                    DbLinks dbLinks = new DbLinks();
                    PartialIdList partialIdList2 = moment.messages;
                    dbLinks.total = partialIdList2.count;
                    dbLinks.links = partialIdList2.links;
                    ((DbObject) dbLinks).id = ((DbObject) moment).id;
                    this.f6467f.upsert(dbLinks);
                }
                ListIterator<String> listIterator = moment.messages.ids.listIterator();
                HashMap mapDg = FeedModule.m1140H().dg(envelope);
                while (listIterator.hasNext()) {
                    Boolean bool = (Boolean) mapDg.get(listIterator.next());
                    if (bool != null && bool.booleanValue()) {
                        listIterator.remove();
                        moment.messages.count--;
                    }
                }
            }
            this.f6464c.upsert(moment, new f30() { // from class: l.zxg
                public final void call(Object obj, Object obj2) {
                    byg.m9057l((Moment) obj, (Moment) obj2);
                }
            });
            if (User.isTeamAccount(moment.owner) && z2 && feedData.messages.size() != 0 && feedData.messages.get(0) != null && !feedData.messages.get(0).recalled.booleanValue()) {
                FeedModule.m1140H().ps(((DbObject) moment).id);
            }
        }
        Iterator<MomentActivity> it = feedData.activities.iterator();
        while (it.hasNext()) {
            this.f6465d.upsert(it.next());
        }
    }

    @Override // p007l.pp2
    /* JADX INFO: renamed from: b */
    public void mo9060b(Envelope envelope) {
    }
}
