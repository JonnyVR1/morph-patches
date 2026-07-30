package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import l.j760;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeItemPicUtils {

    /* JADX INFO: renamed from: a */
    public static HashMap<Privilege, j760<String, String>> f7565a = new HashMap() { // from class: com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeItemPicUtils.1
        {
            put(Privilege.vip_super_like, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IlM2T08yRjI0UkxWWUo3WEdIVEhYWUtBVUdKMkFXNDE0IiwidyI6NTcxLCJoIjo1NzEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozODI5NDkwMjQ3MDMwNjA3ODczfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IkRHVERGNVhMWEhLVURONFJQVEJXWEpZQllRVEYyQjE0IiwidyI6NTcxLCJoIjo1NzEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjk2ODMwNTE3ODA0NjIwMzAxfQ.png"));
            put(Privilege.vip_undo, new j760("https://static.tancdn.com/pe-webplatform/-nffpUlMSA8amV8Cf6U2HzKU.webp?format=originalOFGHLERTH", "https://static.tancdn.com/pe-webplatform/zzrXSpsuEpYBZkVNDVfoo0Y_.webp?format=originalOFGHLERTH"));
            put(Privilege.vip_unlimited_likes, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6Ilg0TUhZMkVCTTJOWTZLN082NFk0NDRBTTZFRDdCSTEzIiwidyI6NTIyLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MDkxMzkwMTg3MTY3MDkzNzA4fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkVCWlNYWVBWUE41NEY3MzNRSVU2RjVJTVM0SUk1NjEzIiwidyI6NTIyLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NjcwMTY4NTM5Mzg3OTg3OTEyfQ.png?format=originalOFGHLERTH"));
            put(Privilege.vip_location, new j760("https://static.tancdn.com/pe-webplatform/p-F-pqINMrLr8OAVqg7hOhIQ.webp?format=originalOFGHLERTH", "https://static.tancdn.com/pe-webplatform/p-F-pqINMrLr8OAVqg7hOhIQ.webp?format=originalOFGHLERTH"));
            put(Privilege.message_read_state, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IktKVFZMQ0ozWUI2T1FVS1JVNE42SUtVVVVRUjYySjEzIiwidyI6NTgyLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDM2MDA4MzYxNjMwNTY4MjI0fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IktKVFZMQ0ozWUI2T1FVS1JVNE42SUtVVVVRUjYySjEzIiwidyI6NTgyLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDM2MDA4MzYxNjMwNTY4MjI0fQ.png?format=originalOFGHLERTH"));
            put(Privilege.advanced_filter, new j760("https://static.tancdn.com/pe-webplatform/7A9Al8H2FFSbExv1GqFsr1MG.webp?format=originalOFGHLERTH", "https://static.tancdn.com/pe-webplatform/7A9Al8H2FFSbExv1GqFsr1MG.webp?format=originalOFGHLERTH"));
            put(Privilege.letter, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IkNSNjRBSE1ZN1lDNlcyNU1GQkFQUldQWVlCWUZUSjA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjg3OTIwMTYwNjY0NzkxODIzfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IlZWS0k2VlFKQUhJRUYzQzNQQkozQ1dLNzZNQ1BQWjA4IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjkyNDA2MTg1NTIzMDkxNzM1fQ.png?format=originalOFGHLERTH"));
            put(Privilege.privacy_membership, new j760("https://static.tancdn.com/pe-webplatform/2Y_TCeZeRoq53Wo6fu4bp2Ix.webp?format=originalOFGHLERTH", "https://static.tancdn.com/pe-webplatform/ElFZesMjN6fcDzt8NmzOmhlv.webp?format=originalOFGHLERTH"));
            put(Privilege.recover_unmatches, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IkE3VDJHQlNaRE01QUpDSldINFhNR1JJTEZEQzNISTEyIiwidyI6NTM5LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4ODgyNjEzOTY2MzAzMTM3MzQ0fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IlNFWE43U0YyUTJDUUZCVkVYQzM3VjVSQ1NQR1ZKNDEzIiwidyI6NTM5LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4ODg3MjMyOTk4MDQ2MDQ0MDAwfQ.png?format=originalOFGHLERTH"));
            put(Privilege.see_who_likes_me, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IldKWlFVVVRQSEpJM0FGN1lTRlU1UFJaUjI0RVA0MjEyIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjk0MzIwNDAxMTA5MzEwMjA4fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IlFNNklaUEQ2VUxDSTU1VVpIS1YzRzdSVVhFRk43RDEyIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjcwNzk0Mzg1NzAzNjU2MTkyfQ.png?format=originalOFGHLERTH"));
            put(Privilege.online_match_tickets, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IkhXU05SUFo2VUQ1UlFNSkw1S1JSQkROQ1U2WjJGTTEyIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTE3NjM0OTc2NzM4OTY4NDUyfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IldQQ0MyM0xOMlBQWFVVQkxYSDdYN1lQR1pDQ1BIQjEzIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTE3NjM1MDEwOTY0NDg5MDg4fQ.png?format=originalOFGHLERTH"));
            put(Privilege.online_match_tickets_oDiamond, new j760("https://auto.tancdn.com/v1/raw/5a97d270-ec59-4f40-8810-488a1a60018812.webp", "https://auto.tancdn.com/v1/raw/5a97d270-ec59-4f40-8810-488a1a60018812.webp"));
            put(Privilege.voice_quick_chat, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IkpDTlhZMk9IUUFISE42SVRMVlhGT0VVWDNDTTZKMjEzIiwidyI6NjA2LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDE4NzcxNjMyNzczNDkxMjk4NH0.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpDTlhZMk9IUUFISE42SVRMVlhGT0VVWDNDTTZKMjEzIiwidyI6NjA2LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDE4NzcxNjMyNzczNDkxMjk4NH0.png?format=originalOFGHLERTH"));
            put(Privilege.boost, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IlpGN1k1QlBSQlpDNVhOQzZSSVdKVkFDT0hIWlZGTjEyIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTc4MjU4ODY3NjQwNjY5MjEyfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6Ik82WDdLV1BPQU8zTkdLSkQ3VDZUNlZUVExEWkw0UzEzIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTc2NDY0NDQ2NzMyMTk1MzU2fQ.png?format=originalOFGHLERTH"));
            put(Privilege.liked_user, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IjRaS1ZIQ1VGNEw3SjJXN0pQSVpKQVRRQkVJQTNZNDEyIiwidyI6NDg5LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDI5NjYwNDAwODY0ODI5MjYxNX0.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkFFWVlSTk5aWFhaQUc3NFRGRVdXNk9LSEFJRkJVWDEzIiwidyI6NDg5LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDI5NTQ4MDIxMzgzMTIzMDc1M30.png?format=originalOFGHLERTH"));
            put(Privilege.picksMembership, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IjVRUUk3UzUzTUpKS1JTRzJTTlBRQkdZRzMyNlhYNzEzIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NjM1MzQxODUyOTI2MDkwNzU1fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkhKVFkzUjdRSjZHNVVZRFA2NE42N0pOVldES1VUUzEzIiwidyI6NTMxLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2ODY2NDgzMDIzMTI1MjI0NDUxfQ.png?format=originalOFGHLERTH"));
            put(Privilege.oDiamondVisitor, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6Ikg1TVBLU0tOQUZYNURWVzZRQ1NIM042WkVKNE9aUzEyIiwidyI6NTQwLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2OTI4NzY5MTE5MDc5MTkxMDcxfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IjNMUDc1RlRJWVQzVEtGM0lJUzNMUkxJNjY3TU9XRDEyIiwidyI6NTQwLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2OTMwNzg3ODU2MTc5MTA2MzI3fQ.png?format=originalOFGHLERTH"));
            put(Privilege.immediately_match, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6Ik9SRjJFSkw1QjRUWkIzUEVTNjVWSDNLTUlEVzZKRzEzIiwidyI6NTQ2LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NjU0NjI2MzQxNTAzNDYwODc5fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkxQVkNJUlVUUlZOV0VKSVROVEZOQTJNWlhJU0VQMjEzIiwidyI6NTQ2LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDc0MjY0MDA3MjkyODQyNTI3fQ.png?format=originalOFGHLERTH"));
            put(Privilege.moment_boost, new j760("https://auto.tancdn.com/v1/raw/d33dea27-4357-4a54-a76a-806a175b873513.webp", "https://auto.tancdn.com/v1/raw/afab65c0-d236-44c4-9bbd-5479e64838d312.webp"));
            put(Privilege.leave_message, new j760("https://auto.tancdn.com/v1/raw/349da37c-b548-4c22-9359-346b4c39449812.webp", "https://auto.tancdn.com/v1/raw/6f04ae5e-e0e8-4c72-9955-e4074543f96913.webp"));
            put(Privilege.accelerate_pairing, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IlQ3RFpBRllNVk5JQ1c2SjUzRUxHSkVQSERFSDRVSDEzIiwidyI6NTQwLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTIxNjY4OTI1MzQ2NjE2ODMyfQ.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IlhaQ05IUkdFMlVDQTQyWTNLQTNFM1ZCV0wzSEM1TzEzIiwidyI6NTQwLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODE3MDQyMjkwNTUxNTU3NjMyfQ.png"));
        }
    };

    /* JADX INFO: renamed from: b */
    public static HashMap<Privilege, j760<String, String>> f7566b = new HashMap() { // from class: com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeItemPicUtils.2
        {
            put(Privilege.vip_location, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IjJMRkxPNFdLQjVSSTVIMkhKQVpVUDQzSjRORkZPTTA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3ODU5NzUwMzE5NjY5NzI2MDExfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IjJMRkxPNFdLQjVSSTVIMkhKQVpVUDQzSjRORkZPTTA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3ODU5NzUwMzE5NjY5NzI2MDExfQ.png?format=originalOFGHLERTH"));
            put(Privilege.message_read_state, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IktKVFZMQ0ozWUI2T1FVS1JVNE42SUtVVVVRUjYySjEzIiwidyI6NTgyLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDM2MDA4MzYxNjMwNTY4MjI0fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IktKVFZMQ0ozWUI2T1FVS1JVNE42SUtVVVVRUjYySjEzIiwidyI6NTgyLCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDM2MDA4MzYxNjMwNTY4MjI0fQ.png?format=originalOFGHLERTH"));
            put(Privilege.advanced_filter, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6Ik1RN0Q2VDVOQVdWSUVCNEZZNkVSUURPSEJWTDUySzA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjQ4NTM0Njk5ODgzNDY4ODI3fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1RN0Q2VDVOQVdWSUVCNEZZNkVSUURPSEJWTDUySzA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjQ4NTM0Njk5ODgzNDY4ODI3fQ.png?format=originalOFGHLERTH"));
            put(Privilege.letter, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IlRQM0FURkJVTTVBQ09QRzJIQ1A2TTdQVUlUM0g0QTA4IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MzAxMzYyMDkwODExNjYxMDcwfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IjNDTkpKSVJWQlpCSlpCU0hYT0JGUTZFTlJKUTM3STA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjg3MzM5NjM1OTQyMjk5OTI3fQ.png?format=originalOFGHLERTH"));
            put(Privilege.see_who_likes_me, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IjRFVVVZWVZOU1U1NFdCREhFVFFIUUZNMkZTQllOTjA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNzUyMDQzNjk3Mzg4NDU5MjY3fQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkFCV0ZZTjZGVE1CUjZXUTZPTVNWQVk1WDNLUFpBWjA4IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzI4NDk2NzU1ODYxMTY3MzYzfQ.png?format=originalOFGHLERTH"));
            put(Privilege.online_match_tickets, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6Ikw1WFBVQlpDS1pIRTVYT1dRRUJMS1U1S0pGSzdQTzA5IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjYwOTU5NDM4ODU3ODc2MjMxfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkZHM0pEQTdXWE1PRUNMTktNUTVZS01PV0g1NktYRTA4IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDA4OTMzNzgxNjAyNDE1MzYzfQ.png?format=originalOFGHLERTH"));
            put(Privilege.voice_quick_chat, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IkpDTlhZMk9IUUFISE42SVRMVlhGT0VVWDNDTTZKMjEzIiwidyI6NjA2LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDE4NzcxNjMyNzczNDkxMjk4NH0.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpDTlhZMk9IUUFISE42SVRMVlhGT0VVWDNDTTZKMjEzIiwidyI6NjA2LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDE4NzcxNjMyNzczNDkxMjk4NH0.png?format=originalOFGHLERTH"));
            put(Privilege.liked_user, new j760("https://auto.tancdn.com/v1/images/eyJpZCI6IkRUTzNTSVRLVlZNSEJSQVFMUVdCSExURTZTR1haMjA4IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNzU0MjkxMTcwOTc5MTU5MDQzfQ.png?format=originalOFGHLERTH", "https://auto.tancdn.com/v1/images/eyJpZCI6IkhZUTM1UjRRTUpSVFo3TFo1NEJCSVdONlhMUlFQTTA4IiwidyI6NTcwLCJoIjo1NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNzUyMDI4MzAzMjg1MzU5NjI3fQ.png?format=originalOFGHLERTH"));
        }
    };

    /* JADX INFO: renamed from: c */
    public static List<Privilege> f7567c = new ArrayList<Privilege>() { // from class: com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeItemPicUtils.3
        {
            add(Privilege.vip_location);
        }
    };

    /* JADX INFO: renamed from: a */
    public static String m10886a(Privilege privilege) {
        j760<String, String> j760Var = "en".equals(Locale.getDefault().getLanguage()) ? f7566b.get(privilege) : null;
        if (!NullChecker.a(j760Var)) {
            j760Var = f7565a.get(privilege);
        }
        if (NullChecker.b(j760Var)) {
            return (String) (f7567c.contains(privilege) ? CoreModule.f1534c.f3628e0.m21483na().isFemale() ^ true : zz6.u0() ? j760Var.a : j760Var.b);
        }
        return null;
    }
}
