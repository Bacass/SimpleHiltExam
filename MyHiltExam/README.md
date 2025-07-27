# MyHiltExam

Hilt를 사용한 Android 프로젝트입니다.

## 코드 스타일 및 포맷팅

이 프로젝트는 ktlint와 spotless를 사용하여 일관된 코드 스타일을 유지합니다.

### 사용 가능한 Gradle 태스크

#### 코드 포맷팅
```bash
# 전체 프로젝트 코드 포맷팅
./gradlew spotlessApply

# Kotlin 파일만 포맷팅
./gradlew spotlessApply -PspotlessFiles="**/*.kt"
```

#### 코드 검사
```bash
# 전체 프로젝트 코드 스타일 검사
./gradlew spotlessCheck

# Kotlin 파일만 검사
./gradlew spotlessCheck -PspotlessFiles="**/*.kt"
```

#### ktlint 직접 사용
```bash
# ktlint 검사
./gradlew ktlintCheck

# ktlint 포맷팅
./gradlew ktlintFormat
```

### IDE 설정

#### Android Studio / IntelliJ IDEA
1. **ktlint 플러그인 설치**: Settings > Plugins에서 "ktlint" 검색 후 설치
2. **EditorConfig 플러그인 활성화**: Settings > Editor > Code Style에서 "Enable EditorConfig support" 체크
3. **자동 포맷팅 설정**: Settings > Tools > Actions on Save에서 "Reformat code" 체크

#### VS Code
1. **Kotlin 확장 설치**: "Kotlin" 확장 설치
2. **ktlint 확장 설치**: "ktlint" 확장 설치
3. **EditorConfig 확장 설치**: "EditorConfig for VS Code" 확장 설치

### 코드 스타일 규칙

이 프로젝트는 다음 코드 스타일 규칙을 따릅니다:

- **들여쓰기**: 4칸 스페이스
- **최대 줄 길이**: 120자
- **문자 인코딩**: UTF-8
- **줄바꿈**: LF (Unix 스타일)
- **파일 끝**: 빈 줄 추가
- **불필요한 공백**: 제거

### ktlint 규칙 조정

다음 ktlint 규칙들이 프로젝트 특성에 맞게 조정되었습니다:

- `function-naming`: 비활성화 (Compose 함수 대문자 시작 허용)
- `no-wildcard-imports`: 비활성화 (Android 프로젝트에서 자주 사용)
- `value-parameter-comment`: 비활성화 (파라미터 옆 인라인 주석 허용)

### Git Hooks (선택사항)

커밋 전 자동 포맷팅을 원한다면 pre-commit hook을 설정할 수 있습니다:

```bash
# .git/hooks/pre-commit 파일 생성
#!/bin/sh
./gradlew spotlessApply
git add -A
```

## 빌드 및 실행

```bash
# 프로젝트 빌드
./gradlew build

# 앱 실행
./gradlew installDebug
``` 