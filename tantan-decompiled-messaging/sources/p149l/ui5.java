package p149l;

import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ui5 extends b8c implements pp2<CommonData> {

    /* JADX INFO: renamed from: c */
    public orh0<DbLinks> f176630c;

    /* JADX INFO: renamed from: d */
    public y9k0 f176631d;

    @Override // p149l.b8c
    /* JADX INFO: renamed from: c */
    public int mo100761c() {
        return 32;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: d */
    public int mo100762d() {
        return 0;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: e */
    public String mo100763e() {
        return "commonDb";
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> mo100764f() {
        return super.mo100764f();
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: g */
    public void mo100765g() {
        rpq.m180387b().m180391e(CommonData.JSON_ADAPTER, this);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: h */
    public void mo100766h() {
        this.f176630c = new orh0<>(this, "links", DbLinks.DB_ADAPTER, null, 1000);
        this.f176631d = new y9k0(this, "users", User.DB_ADAPTER, null, 1000);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: i */
    public void mo100767i() {
        super.mo100767i();
        rpq.m180387b().m180395i(this, CommonData.JSON_ADAPTER);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: j */
    public void mo100768j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN inactivated_c INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_country_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_province_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_city_c BLOB");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_profile_zodiac_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_status_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_gender_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_membership_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_source_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_membership_vipBadgeType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_profile_studies_qualification_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_location_invisibleFields_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_profile_extensions_physical_bloodType_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_profile_extensions_basic_friendPurpose_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN str_profile_extensions_friendStatus_status_c BLOB");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_momentSwitch_noSyncMoment_c BLOB");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_wealth_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_qualification_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_physical_height_c BLOB");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_profileCompletion_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_voiceSignature_c BLOB");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN activityUser_action_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN activityUser_score_c INTEGER");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN matePlanUser_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN matePlanAdUser_c INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN regionTag_c TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN localLikeIdentifiers_c BLOB");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN deleted_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_interest_tags_c BLOB");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_live_voiceImgId_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_live_voiceImgUrl_c BLOB");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_mate_c BLOB");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_pet_c BLOB");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_tailFrame_url_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_tailFrame_expiredTime_c BLOB");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_business_avatarID_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_business_avatarExpireTime_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_business_avatarClose_c BLOB");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN specialEffect_c BLOB");
            case 18:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_ethnicity_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_language_c BLOB");
            case 19:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_voiceAvatarFrame_c BLOB");
            case 20:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_physical_heightImg_c BLOB");
            case 21:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_marriage_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_address_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_familyBackground_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_physical_weight_c BLOB");
            case 22:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN verifications_others_otherCTDID_verified_c INTEGER");
            case 23:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_game_c BLOB");
            case 24:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_facialFeature_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN verifications_idCard_age_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN verifications_idCard_first4_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_physical_fitness_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_physical_drink_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_physical_smoke_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_mbti_c BLOB");
            case 25:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN userActivityInfo_c BLOB");
            case 26:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_ideal_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_unideal_c BLOB");
            case 27:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_moments_counters_totalNormalMoments_c INTEGER");
            case 28:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_interest_taste_c BLOB");
            case 29:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN location_region_province_c TEXT");
            case 30:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_intlFriendPurpose_c BLOB");
            case 31:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f176631d.f145283d + " ADD COLUMN profile_extensions_basic_intlFriendPurposeV2_c BLOB");
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m193852l(DbLinks dbLinks) {
        this.f176630c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: n */
    public void m193854n(final DbLinks dbLinks) {
        f8c.m119878o().m119881B(new d30() { // from class: l.ti5
            @Override // p149l.d30
            public final void call() {
                this.f170531a.m193852l(dbLinks);
            }
        });
    }

    @Override // p149l.pp2
    /* JADX INFO: renamed from: b */
    public void mo104456b(Envelope envelope) {
    }

    @Override // p149l.pp2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo104455a(Envelope envelope, CommonData commonData, boolean z, boolean z2, boolean z3) {
    }
}
