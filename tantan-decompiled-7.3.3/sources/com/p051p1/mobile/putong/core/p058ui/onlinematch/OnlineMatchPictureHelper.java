package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchPictureHelper {

    /* JADX INFO: renamed from: c */
    public static volatile OnlineMatchPictureHelper f33471c;

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f33472a = new MaxSizeHashMap(38);

    /* JADX INFO: renamed from: b */
    public int f33473b = 0;

    public static class MaxSizeHashMap<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        private MaxSizeHashMap(int i) {
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }

    /* JADX INFO: renamed from: b */
    public static OnlineMatchPictureHelper m51378b() {
        if (f33471c == null) {
            synchronized (OnlineMatchPictureHelper.class) {
                try {
                    if (f33471c == null) {
                        f33471c = new OnlineMatchPictureHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33471c;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<String> m51379a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (CoreModule.m30929H().userId() == null) {
            return arrayList;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            Settings settings = userM116600p9.settings;
            LookingFor lookingFor = settings == null ? LookingFor.get("unknown_") : settings.getLookingFor();
            arrayList.addAll((TEnum.equals(lookingFor, "unknown_") || TEnum.equals(lookingFor, "both")) ? userM116600p9.isFemale() ^ true : TEnum.equals(lookingFor, "female") ? m51380c() : m51381d());
        }
        this.f33473b = (this.f33473b + 1) % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> m51380c() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f33473b == 0) {
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6Ik41N1ZDSTRUVDdUT0lTSEZZU0JKS1IzSlc0WEc1VzAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDk2MjUxMjIyMzgwNTI4OTAzLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6Ik9ZNElUTTU1VUFUN1pOS0tRMkRUWUtLNzJaNk9GSTAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjg5MzkzMTExNzgzMjIyODExLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IldFQVpGRFpMWkVRV0NIU1BJMjJUNUxEVktMUkhHVDAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjYwMTc4NDc5ODIwMTU1MTg3LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjNYSDU2RFpZUkxDNEM0N1ZMWUpaNVlPVFZZRVRXQjAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDQxNzM1NjE1MjEwNDg1MjkxLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlYyWVUyUkNTM1c1Vk8yNkZEM1BOQzJPTElHSzVTNTAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTI4NDg0NjQ0MzAxMzE3OTMxLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjdCTE1ONFBTNklTVVBCU1pRUE9SUEdQQjZQWTM2VyIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTcwNTM3NjI1NTc3MTc5MTkxOSwiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlA3Sk5BTVZYWENBT0VUU0ZKUUdMVVlVWEozT1lKTyIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTcwMDkwNjA4OTM3OTkzMTY5MSwiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IldSQjQ0Rjc1TDJXNFo2SjMzS0dBTkhKM1JSQVNXWTAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTQxMTQwNjM5NTI1MTgwMjAzLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkpPWVZYSFlDRlZPMkhJWVVENlNVUUtXS1RWMkhXSDAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODUwNDA3MjgyODg0OTA4NTY3LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjVWR0tFUEdaTEpVMjVNUDZKVUdGTkRSWU9aWUI0STAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODMxNDcyNDIyNDQxMDQ4MzQzLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlI3NkRGRktHVFlHTTRWRlBJUFlNUVhMR1RKTk5ZRjAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MDEwOTcxNTA3NTAwNDM1NzUxLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkFRWkJYRkFZNzY0TllQR1VUVlBLNjZKNjRZRE9PTiIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTM4ODY5NzA5MTgwMDYxOTUzNSwiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IllKNllDTjU3UFhHS0NYTFlONk9BV1hWQ1VWRkVGRyIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyNjgzOTkzNDQyMjEwODk3MSwiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJMREwzSU1YM1hFM0lHN0dJUTZaSlFZV0xDNE1SWCIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTM3NDI4NzA4NTA2Mjk0MDk1NSwiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlNOVldVWVdKUExETk9PM09SNTdFUUxWR1VCVlVKNSIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDAxMTg0MjgxNzQxNjkzMDgzOSwiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlNKNFUzNlFXQzZCREJISjJET1VEUlhHV0VYV0I3MjAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MzI0OTQzNDU5MDA1NDMwMTksImFiIjowfQ.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlFZRldCNjVGNzZEWENKNlBaU1lDNlVPTUFDQ1NCNjAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTUzNTU0MDQxMTM0MDAzNDk5LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IldBQlpNR0NHWVBSQlM1UVNaSFBTVlRYVTU2VFhRTjAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTQ5Nzg2NjY3MDk0NDg4NTgzLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkdEWVpRRlo1Tk0zWk9RSTJZRFhQWkVLQkZJQ1VXNjAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTE1MDM3OTk0Nzk0NzkzNTE1LCJhYiI6MH0.png");
            return arrayList;
        }
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjJCSERWR1pXTUlGUUc2U0I1QlNUTERSQUQzWkJMUTAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg2OTkwMTc5NjEzNjgyNDc1LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkpFQ1VGUlpJSFNMTEVFWVM3UlY0Slk3UERTU0NSTDAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTEzNDM0MDk2MzYwNzY0MjE5LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlhBU0hLUEJCSU5FUUlYVUxQSEpZUU5RUjZKQ0xVVDAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTU3NTE3NjI5OTY5MTE2MzEsImFiIjowfQ.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkdKQ1FJQkJTVUlZVjVOVDVMQ1VYWFdGWkZMRkdXWTAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTYwMTQxOTc1NDE5MjM3MTM5LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlVQUFRMWFpMVDRISlZONEtETjRDNVdQNlpLQkFZTyIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjUzNjI4NTk4MDM1MDc4NDAyNywiYWIiOjB9.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJYUDdRVEdKTk5DQzM0TzRYWUFGR1VBVkhEVjNRUTAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjgwMjkwMTA2MDE0MDYxODM5LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjMzVFpYNzM1VVAyUEI1MzJPVlZBVzI3S04yWlNCWDAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzk3NzQ2MDkyMTE0NTUzNjM1LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlhTU0hWRFYzWUgySDNNWFRJTjZZQUQ1Nlo2MzJBNDAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEzMzExODIyNjEyMTQ5NTQ3LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IktOUVkzSTZNNDdWTVFWNE1EU1RMNktBS1UyRkU2VzAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEyNzE0MzM2Nzc2MTQ1OTYzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlBTVUc0UzdRWUI1Rk1ER0dDR0FaUTQ0SkVSNkZRQTAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTI2NDI3MTM3ODMxNDkxODUxLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlE2U1JKQ0taRElXQkMyNVZZUkM1Q0FJSjNRR0ZSVjAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjg5NjMwODI5ODM1Mjk1MjUxLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjdITjVXU0FXNUpPSkdMNzU0NldRTU9QUE0zMkxGWjAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTU4Mzg0MjA2NTk1NTAyODkxLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlZaM1NaMjQ3VE1LRzRJM1cyVTNIT1IyWkdMN1oyQjAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MTM5MjQ5NDg1OTEwNzI4MTEsImFiIjowfQ.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjVCNVc3VENEVkpGNUQ2QUIyMlc2SlZBSUpSSkZBTzAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDM3ODE3MjEzOTI2MzIyNzAzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlFQUEVWTERZQ1lPUEc0RjY0Q1VKRUtFWFlISkxLNzAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTI0MzU5NzUzMTQ1ODA4NjgzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlVBRVFDN0dRNUo3NTJUMkVRNEU0NlU1VENMQ0JPVDAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjk5MTUxNDMwNDgyNjc5MzExLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkxETkJRSVZaNFlCSzRDNVFUNktEQ0dJNEQ0N0JLSzAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODUyNjI4Njc1OTU5NDcwMzQzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkFOTFVGRU83UEdONFJPT0lKS0NKNEVYQ0pJSkZVUzAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODQwNDY3MjU0NjQ4Njc0MzExLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjNCV0tMWFNQUlBZWldYNVFTQkxCWFpCN1ZWNkVHMyIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzE1ODY0MDI4NDg5OTQ4ODI4MywiYWIiOjB9.png");
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList<String> m51381d() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f33473b == 0) {
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkRVWUJPRElTWUlJRUZSUDNPMlNZQTdHM0VRQlFUNSIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQxNjAwNDc1MzA2NDM2NzY2MywiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkRLUVZDNDJXR0ZFSUlNNDQ2SFhFRFJHUU1RUURWQTAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTU1MjgzNzI1MzQ1Njc0Mjc1LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6Ik5PN0VNQkpYTk5SR0xKS01KTjVIVkhWUjQ0UE5XTzAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDE2NzExMDUzOTI1NzI0Njg3LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlRXUDc1U1JKQk5aNjc0VU9KSkZXM1RaRVhPNUZKUzAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTQwMjQ3MzYxNzEwMzYxMzg3LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjRPUEhUUjY1UUxFT0tGRFVTWTRKQlVWQks1UldNQjAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg0NDc5Nzk4MTE2Mzc0ODI3LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlE1RkRHUTJLTURXQUIzNkxBN1lQS0laNkpCRkkyRyIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjU2MzgzNDQzNDY3NDEzODY1MSwiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlRUWVM0TEZISVRSM1ZYNVdTQ0M3RFNTNUU1VDQ1QzAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzgxMDc5NDI4NjAyMTE0ODMxLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlVBQ0pFWFRWVk5CTFk3S1BJUDNWRFQ1RDdMSUw3MzAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjYyNDMzNzM5NDE4NjUzNDc5LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjJOTUQyWFFWT1dLRUJPR0w2WVRTWkE2RzRRWVRDSTAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTA4NzA2NzE5MTY3MjA2NjYzLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlREN0dCWVpFM0xYVUNYWk5KWkk0VTQ2QUtMUVJOTDAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTE5ODA5MDM1NTk0MTkzMTk1LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjM3QTdJWVlLUkpNWFBPNk1RTUtYNTZNSkk0UExOQjAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjc4MTQ1OTU0NzQ3MjYyNTA3LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjdGUEo1R05TS01ONFRJSlY3U0ozVzVUSDVYTFFJSSIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTY3ODMzNTk3NjYzMjQxMjIwMywiYWIiOjB9.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkkyRUNWTTdOU1RMWUhBR0tMR0dFSVFTRFhKSU1NNzAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTExMDk5ODg5MjIyOTU2MDc1LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkY0Qk1MWUU2VVVQQ1hNTzJHQU1ITUJON0RJREdIVjAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTY4ODU4ODE1OTQ1NTk0MTU5LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkJYSVBWU1NNWEc3SDZLNVZTMjRRUE5LN1JQSjNZQTAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNzA0NjU1MjQ5NzgzNTA3NDk5LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkpLMkhDSEtXU1BSMkc2QVlRTFY1SERURlhQUFBIUDAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MTQ4NTU2NzMyODM1NDA4NDI3LCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkMzRjc1WTVEWVkyWVdCWUNTUVlPVE9PWktQQ1k1WTAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODM0NDExMzQ2MTUzODcyOTExLCJhYiI6MH0.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkhERDM3VlNFM0dKRVo2VVJHUU5QNFRTN0hPTVZVUzAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MzQ1MjUzNTk2OTc1ODQ5MTEsImFiIjowfQ.png");
            arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjdMNE1IUFFYSlJOUjVCVjZFNjZPSzJFNTNKQTdFRjAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTY5NTk3NDMxODc4ODU3NTA3LCJhYiI6MH0.png");
            return arrayList;
        }
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkxBSFRPM1FMVlQ1SEVBTDNJSlo0WUROUlpYUFBVMzAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODY1OTM2NTgzMTg3MDE5MzAzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkhTQ0RUQlgzU0o2TjdHNExGM01FVU82T1E0Sk0zWDAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTc1Mjc1MzU5ODE2NzM1NTM1LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkNOVzVJUFBBUkxJNjZBTVZQWU1YSUNKV0JFQTJHSCIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzQzMDAwNDIxMTM2ODg4ODg3MSwiYWIiOjB9.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkozRE1IMkpBM0tDQlRENDdDUFlYMzVZWDdLWFFLQTAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEzNTc2MDQ2MzgyMzEyNTAzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjJaN1ZRRllEUk5DTVVMQlZUTEVHU0tUSTdPSEc1VzAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzA1NDAyOTA3NTk2NDk3Njc5LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlhCTjQyUEZYVUJUUzRZU1RJTjJPUTRWQU1TVVlZTzAxIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTc5NzgzMjc1MzE0NzQ0MTA3LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlRKQlgyTTZaVElUQ1pMR0tUU0tEUFhEM1Q3TjNGMzAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDI0MzgzMDU1MDM1OTkzNjQzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjVaWVZFVEtEVFJSUlZOUjNSUVZOVU8yUFFZSUJXVTAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzAzMTQxMzQyOTMyODA2Njk5LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkdDRlE3Ukk0UVBPTjZQRk82RFBHQTZRVE9ES0UySDAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTI0MzExNTY1ODE4OTI1ODY3LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkRHN01VU1dHQUc3V1pHSlJYNzNCREhCSEo2UjVNVTAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MjUxMzE0NjU3NjQ5OTE3NzksImFiIjowfQ.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IllaRVJINFFBNklQUTZIWldGNzJKNjVETzNGWFBFQSIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzExMDgzNjAzNzU1MTEzMjk3MSwiYWIiOjB9.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjdFSjRUSTRHT1FPSjIzT0E1R0lZWlVNUklZRUdZMzAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNTc5MDk2NzA3MzQxNDY1MTMxLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjVDVFJVVzRGWElURUk3UEdGMjQ1SElBWldOWEhLUDAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzk3MTQ3MDc0NjQ0NTE0NjAzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjNKTjREVUlWVlc1NlVWRlpQN1QzWU43QzJDRDRHUDAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTA4NTgwNjk3NjEyOTAzMjI3LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlQ3VjZNQkZRR1VTUkJPQ0RPTTRFWlVSVkZUMktCUzAyIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNzI1NTA5MTY0NDU0OTE3NDAzLCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkNPRkFGUktLU0pRRVRJVkhRQUhXUTRGVDdMTVRRQSIsInciOjEwOCwiaCI6MTA4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEwOTEyNTIxMzUyOTMxMDQ3NSwiYWIiOjB9.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IjIzTjVaRUhCRjJLRlI2TjZITlBESVlNTjZRTkhJNzAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTkyMTY3Mjk1NDMxODEzOTQ3LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkpLS0hZN0xMUURZVFI1WEhIN05WRUJGWFFaSFM3RzAzIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTUzODEzOTIxMDQ1MzMzMDM1LCJhYiI6MH0.png");
        arrayList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlQ1UVc2SEZBTklIMzRGSFFHRUNRSzRMNjcyTklSVjAwIiwidyI6MTA4LCJoIjoxMDgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDM0Nzk3MDAyMjc4OTA0NTkxLCJhYiI6MH0.png");
        return arrayList;
    }
}
