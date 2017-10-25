#!/bin/bash

if [ $# -eq 0 ]
  then
    echo "No new project name supplied"
    exit 1
fi

PROJECT_NAME=$1


echo New project name is: $PROJECT_NAME

FOLDER_NAME=$(echo "$PROJECT_NAME" | sed 's/-/_/g')

echo New folder name is: $FOLDER_NAME

echo Moving folders...
mv src/clj_base src/$FOLDER_NAME
mv test/clj_base test/$FOLDER_NAME

echo Editing files in place...
find . -type f -name "*.clj" -exec sed -i "" "s/clj-base/$PROJECT_NAME/g" {} +
find . -type f -name "*.md" -exec sed -i "" "s/clj-base/$PROJECT_NAME/g" {} +
find . -type f -name "*.yaml" -exec sed -i "" "s/clj-base/$PROJECT_NAME/g" {} +

echo Done!
