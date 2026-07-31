## LV 0 요금 폭탄 방지 AWS Budget 설정
<img width="1722" height="1331" alt="LV0-요금폭탄방지_AWS_Budget_설정" src="https://github.com/user-attachments/assets/699cf96f-1aec-4f13-89f2-506cf874e811" />

---

## LV 1 - 네트워크 구축 및 핵심 기능 배포
### EC2 Public IP
### 3.36.32.164
---

## LV 2 - DB 분리 및 보안 연결
- **Actuator Info 엔드포인트 URL**: http://3.36.32.164:8080/actuator/info
### 2. RDS 보안 그룹 설정 스크린샷
<img width="1498" height="678" alt="스크린샷 2026-07-30 202237" src="https://github.com/user-attachments/assets/e6996fc1-166b-4774-b8eb-df996d8b061d" />
---

## LV 3 - S3 프로필 사진 및 Presigned URL
- **Presigned URL**: https://odin-s3-cloud-bucket.s3.ap-northeast-2.amazonaws.com/profiles/b9ef3166-d146-451c-ac52-9ca37738a032_720456991_18035353616802293_5559847020132751608_n.webp?X-Amz-Security-Token=IQoJb3JpZ2luX2VjENr%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLW5vcnRoZWFzdC0yIkYwRAIgMG8DInpaYh3kzQtz7VeJjnPs%2BYg6lDDEani8iXWWRIMCIGmc2R1LV8hp1YfYCm7zWsnoWlOWMyRfL4McPYoMgLx5KtEFCKP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQABoMMjY0MDUzMjI5ODk3IgxL2QqpyQ1pZHYTX2YqpQWfkuVvvdcVhX9SnY2MbM90IAhQ6uJQ1LKMzPgWWnfRlUTe%2F%2BVvbYAO85sEEbVlXLcifByV1dMj%2Ba1c1o0UywvOVCWZa2UoA21ufYCMEhBAzuYyikWf4ZjLGsTPMWCkyFY0yp7kjqpj1mK1e30%2BuFJPWfMA6G3aWqqNsYTX3KL563JQBj74S4FwaLOu8GsUewQzZZKtVquifyGpYh5mQd3E0%2B6uHbHxmCYq%2Fl4Xw98FbifxfOIOgTahavvpUsIwaeSHCj4m1%2Be%2FfCTutOsGTMTlhTJ%2FCCl%2B7Zra9XYKMKNWpN5vjGvRCi%2FRy6mlsRunzWkEVkI5wqaMZXLSrTJ%2B4EJV4L9Q%2FTUkEb%2FZkPBEit3iyPILFsvm4s5QHPvJ7hhhKj6p%2BBx%2Fwkjv1bSiuSsaVkZGZTT2xfCkwT5xHeo4dW0w7CigIg3wv8smH6r5yCnVZXpB4SIjFGepOpPXkiHzXIkfZ1NZwviRFDXXlGToKH%2BU6MLuJYr7YWBX5GMWFAwujsJY2tDrKIfETojHWQ5Yp77m%2F3qdlH3fd77cfgYtM8AbJ%2Fh%2BrFLjHsp2Qt6dTwtMdbMaFb3lhAkgPp7mny%2BQyyAaMPo73Cg55lFNY77iXWjh%2FKVK8ETPamSg1ckLAWPYyNe4C3WuXqGkUxDeh8Xa1dULuFyn%2BXCJXMyb3ansAuWICaHbmnW9AUZjPbMH4Oa5lWYL5i7ZoImqSiy8pM%2BaVk5uYmKLoDuQvmeCaKsVI6iGw8SXpmMLJUqfeuq79PVndfT%2F0Nq80kAqylCLg6Kc6iJ2utr8bZ5dTcP27ptWr7b7LaCo9w%2Fh%2BdrxAeb4%2Bcsa0CnJk49QwsK8REb55vqspfnOov8ctR5qSLxWPygW75YZPLnnppDNJjxAOh97np%2Fb2bKJs6YyAzDvhLDTBjqyAXcnl5DhcaZuLyE301x%2FbrW5dST%2BF1s1kWm9gzJzFcPXCwl4C%2BD1GE00kh7lHZK8xzQlPunKBKjhupzGTdOX93oOtoE1RQCX6vjttq8jDL2TDbqrqNHX%2F%2B6fmYoycKAfSW%2FSpKyoIgdccMtvWC3Ihz77z7%2BFXnXl1OlDd5DNdLUXtJZtjLQdKeUnf%2BQ7pb93178Bpp%2FycLsG6IdtzSYk7kmpn5WiXe7d9Jhfkr33V3E4JFA%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260731T022225Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIAT26WMRFEWYFXNI2E%2F20260731%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=604800&X-Amz-Signature=bb10179df32ad17aca6f82c4459e0de26ffceec2dd0f0b75f8a255c22d3b8ca2
- **만료 시간**: 2026-08-07T11:00:00Z (발급일 기준 7일 후)

### Presigned URL 접속 성공 스크린샷
<img width="1737" height="1372" alt="Presigned_URL_접속성공_스크린샷" src="https://github.com/user-attachments/assets/c7a903c0-28ee-4259-9131-a20a153e1c28" />
